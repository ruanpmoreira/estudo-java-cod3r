package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ruan");
		usuarios.put(2, "Kats");
		usuarios.put(3, "Kari");
		usuarios.put(4, "Maomao");
		
		System.out.println("Tamanho do map: " + usuarios.size());
		System.out.println("Map vazio? " + usuarios.isEmpty());
		
		System.out.println("Conjunto de chaves: " + usuarios.keySet());
		System.out.println("Conjunto de valores: " + usuarios.values());
		System.out.println("Conjunto de chaves e valores: " + usuarios.entrySet());
		
		System.out.println("Contem a chave: " + usuarios.containsKey(1));
		System.out.println("Contem o valor: " + usuarios.containsValue("Kathy"));
		
		System.out.println("Get para pegar a chave: " + usuarios.get(3));
		System.out.println("Remover pela chave: " + usuarios.remove(1));
		
		System.out.println("\nForeach pela key:");
		
		for (int usuarioChave: usuarios.keySet()) {
			System.out.println(usuarioChave);
		}
		
		System.out.println("\nForeach pelo value");
		
		for(String usuarioValor: usuarios.values()) {
			System.out.println(usuarioValor);
		}
		
		System.out.println("\nForeach usando key e value");
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " ");
			System.out.println(usuario.getValue());
		}
		
	}

}
