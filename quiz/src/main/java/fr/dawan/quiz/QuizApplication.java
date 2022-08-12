package fr.dawan.quiz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner{
    


	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // fonction 
   

        //convert byte on file
        
//        File fi = new File("src/main/resources/static/catquizz.jfif");
//        byte[] fileContent = Files.readAllBytes(fi.toPath());   
//    
//        //create  categories
//      Categorie cat = new Categorie("SPORT",fileContent);
//      catService.saveAndUpdate(cat);
//      
//     
//      File fi1 = new File("src/main/resources/static/cg.jfif"); 
//      byte[] fileContent1 = Files.readAllBytes(fi1.toPath()); 
//      
//      Categorie cat1 = new Categorie("CULTURE GENERALE",fileContent1);
//      catService.saveAndUpdate(cat1);
     
      
      //Create quizz
        
//      Categorie categ1 =  catService.findById(1);
//     
//      Quiz quiz1 = new Quiz("Spring", convertByte("src/main/resources/static/catJava.jfif"), EnumLevel.FACILE, 3);
//      
//      quiz1.setCategorie(categ1);
//      
//      quizService.saveAndUpdate(quiz1);
//      
//      Categorie categ2 =  catService.findById(3);
//  
//      Quiz quiz2 = new Quiz("Champions League", convertByte("src/main/resources/static/ballon.jfif"), EnumLevel.DIFFICILE, 40);
//      
//      quiz2.setCategorie(categ2);
//
//      quizService.saveAndUpdate(quiz2);
      
      // findQuizbyCategorie
      
      
//      List<Quiz> lstQuiz =  quizService.findQuizByCategorie(3);
//      
//      lstQuiz.forEach(System.out::println);
      

      
    }
	
	
//    private byte[] convertByte(String str) throws IOException {
//        File fi = new File(str);
//        byte[] fileContent = Files.readAllBytes(fi.toPath());
//        return fileContent;
//    }

}