package juego.cartas.poker.manos;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class CreadorTest 
{
	
	public static void main(String[] args) {
		
		
		System.out.println("	FactTestManosCreadas factManos= new FactTestManosCreadas();");
		String var= "factManos";
		try{
			//Method[] methods = o.getClass().getDeclaredMethods();
			Method[] methodsAux = FactTestManosCreadas.class.getMethods();

			List<Method> methods= new ArrayList<>();

			for (Method method : methodsAux) 
			{
				if(!method.getName().contains("hashCode")
				&&	!method.getName().contains("getClass")	
				&&	!method.getName().contains("equals")	
				&&	!method.getName().contains("toString")	
				&&	!method.getName().contains("wait")	
				&&	!method.getName().contains("notify")	

						
						)
				methods.add(method);
			}
				

			
			
			for (int i = 0; i < methods.size(); i++)   
			{
				for (int j = 0; j < methods.size(); j++)    
				{
					Method method= methods.get(i);
					Method method2= methods.get(j);

					
					String mano1=method.getName().replace("crea", "");
					String mano2=method2.getName().replace("crea", "");

					int comparador=(i==j?0:i<j?-1:1);
					
					System.out.println("\t@Test");
					System.out.println("\t/**");
					System.out.println("\t* Se compara "+mano1+" con " + mano2+" y debe dar "+comparador);
					System.out.println("\t*/");
					
					System.out.println("\tpublic void test"+mano1+"VS"+mano2+"(){");
					System.out.println("\t\tAssert.assertTrue("+var+"."+method.getName()+"().compareTo("+var+"."+method2.getName()+"())=="+comparador+");");
					System.out.println("\t}");
					System.out.println();
					System.out.println();
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
