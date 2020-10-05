package juego.cartas.poker.manos;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CreadorTest2 
{
	
	public static void main(String[] args) {
		
		
		System.out.println("	FactTestManosCreadas factManos= new FactTestManosCreadas();");
		String var= "factManos";
		
		//Method[] methods = o.getClass().getDeclaredMethods();
		Method[] methodsAux = FactTestManosCreadas.class.getMethods();

		List<String> methods= new ArrayList<>();
	
		for (String tipoMano: new String[]
				{"Pareja","DoblesParejasBajas","DoblesParejas","Trio","EscaleraBaja","Escalera","ColorBaja","Color",
						"Poker","EscaleraColorBaja","EscaleraColor"}) 
		{
									
					
			methods.add("crea"+tipoMano);
			
		}
			

		
		
		for (int i = 0; i < methods.size(); i++)   
		{
			for (int j = 0; j < methods.size(); j++)    
			{
				String method= methods.get(i);
				String method2= methods.get(j);

				
				String mano1=method.replace("crea", "");
				String mano2=method2.replace("crea", "");

				int comparador=(i==j?0:i<j?-1:1);
				
				System.out.println("\t/**");
				System.out.println("\t* Se compara "+mano1+" con " + mano2+" y debe dar "+comparador);
				System.out.println("\t*/");
				
				System.out.println("\t@Test");
				System.out.println("\tpublic void test"+mano1+"VS"+mano2+"(){");
				System.out.println("\t\tAssert.assertTrue("+var+"."+method+"().compareTo("+var+"."+method2+"())=="+comparador+");");
				System.out.println("\t}");
				System.out.println();
				System.out.println();
				
			}
		}
		
	
	
	}

}
