package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class solution {
	public static void main(String[] args) {
		
		List<US500> file=readFileFromCsv("input.csv");
		for(US500 p: file)
		{
			System.out.println(p);
		}
		
		List<US500> file1=getSortedList(file);
		for(US500 p: file1)
		{
			System.out.println(p.getFirstname());
		}
		filterFileBasedOnCity(file);
		
	}

	private static List<US500> readFileFromCsv(String fileName)
	{
		List<US500> file=new ArrayList<>();
		Path pathToFile=Paths.get(fileName);
		try(BufferedReader br=Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
			String line=br.readLine();
			while(line!=null)
			{
				String[] attributes=line.split(",");
				US500 files=createList(attributes);
				file.add(files);
				line=br.readLine();
			}
		} catch(IOException ioe)
		{
			ioe.printStackTrace(); 
			}
		return file;
	}
	private static US500 createList(String[] metadata)
	{
		String firstname=metadata[0];
		String lastname=metadata[1];
		String companyname=metadata[2];
		String address=metadata[3];
		String city=metadata[4];
		String country=metadata[5];
		String state=metadata[6];
		String zip=metadata[7];
		String phoneno1=metadata[8];
		String phoneno2=metadata[9];
		String email=metadata[10];
		String webmail=metadata[11];
		return new US500(firstname,lastname,companyname,address,city,country,state,zip,phoneno1,phoneno2,email,webmail);
	
	}
	public static List<US500> getSortedList(List<US500> l)
	{
		
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=i+1;j<l.size()-1;j++)
			{
				if(l.get(i).getFirstname().compareTo(l.get(j).getFirstname())>0)
				{
					 Collections.swap(l,i,j);
					
				}
			}
		}
		return l;
	}
	public static void filterFileBasedOnCity(List<US500> m)
	{

		//List<US500> ans=m.stream().filter(i->i.getcity().equals("New York")).collect(Collectors.toList());
		for(US500 p: m)
		{
			if(p.getCity().equals("\"New York\""))
			{
				System.out.println(p.getFirstname()+" "+p.getLastname()+" "+p.getCity());
			}
			
		}
		
	}

}
