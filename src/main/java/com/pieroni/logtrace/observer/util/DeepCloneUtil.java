package com.pieroni.logtrace.observer.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCloneUtil {

	public Object clone(Object data)
	{
		try
		{
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream o = new ObjectOutputStream(bo);
			o.writeObject(data);
			
			ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream i = new ObjectInputStream(bi);
			
			return (Object)i.readObject();
		}
		catch(Exception e)
		{
			return null;
		}	
	}
	
}
