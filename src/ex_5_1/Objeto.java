package ex_5_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objeto implements Serializable
{
	int id;
	String nome;
	
	public Objeto(int id, String nome)
	{
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() 
	{
		return "Objeto [id=" + id + ", nome=" + nome + "]";
	}
	
	public void criaObjeto()
	{
		Objeto objeto = new Objeto(1, "objeto1");
		try 
		{
			FileOutputStream fileOut = new FileOutputStream("objeto.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(objeto);
			objectOut.close();
		} 
		catch (Exception error) 
		{
			System.out.println("Não foi possível escrever o objeto.");
			error.printStackTrace();
		}
	}
	
	public void abreObjeto()
	{
		try 
		{
			FileInputStream fileIn = new FileInputStream("objeto.obj");
			try 
			{
				ObjectInputStream objectIn = new ObjectInputStream(fileIn);
				try 
				{
					Objeto objeto = (Objeto) objectIn.readObject();
					System.out.println(objeto);
				} 
				catch (ClassNotFoundException e) 
				{
					e.printStackTrace();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}