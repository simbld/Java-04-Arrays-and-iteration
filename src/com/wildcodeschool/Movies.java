package com.wildcodeschool;

public class Movies {

	public static void main(String[] args) {
		String[] movieTitles = {
			"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade", "Indiana Jones et le Temple maudit"};
		String[][] movieActors = {
				{"Harrison Ford", "Karen Allen", "Paul Freeman"},
				{"Harrison Ford", "Kate Capshaw", "Amrish Puri"},
				{"Harrison Ford", "Sean Connery", "Alison Doody"}
		};
		
		for (int i = 0; i < movieTitles.length; i++)
            System.out.println("Dans le film " + movieTitles[i] + ", les principaux acteurs sont : " + String.join(", ", movieActors[i]));
	}
}
