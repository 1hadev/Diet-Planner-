package projectTest;

//IP TSUN TING H10006777
//SHADEV KHAREL H10006790

import java.util.*;
import projectTest.ProjectData;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class ProjectTest {
	public static void main(String[] Args) {	
		CreateFile();
		System.out.printf("%90s\n","/-------------------------------------------------------\\");
		System.out.printf("                                /"+"%60s\n","         WELCOME TO THE DIET AND WORKOUT PLANNER         \\     ");
		System.out.printf("%94s\n","/-----------------------------------------------------------\\ \n");
		boolean check=true;
		int forWrite=0;
		
		while(check==true) {
			int action=UI();

			switch (action){
				case 1:
					Object[] the_list=new Object[9];
					the_list=Diet();
					forWrite= (int) the_list[the_list.length-1];
					WritePersonalData(the_list);
					break;
					
		      	case 2:
				    workoutPlanner();
				    break;
		      	case 3:
					LoadPlan(forWrite);
					break;
		      	case 4:
					PersonalInfo();
					break;
				case 0:
					check=false;
					System.out.printf("%75s","<Thank you for using our service>");
					break;
				case -1:
					ClearFile();
					break;		
			}
		}
	}
	
	public static int UI(){
		Scanner input= new Scanner(System.in);
		System.out.printf("------------------------------\n 1.DIET PLANNER\n");
		System.out.printf("------------------------------\n 2.WORKOUT PLANNER\n");
		System.out.printf("------------------------------\n 3.PLAN TRACKER\n");
		System.out.printf("------------------------------\n 4.PERSONAL REPORT\n");
		System.out.printf("------------------------------\n 0.EXIT SYSTEM\n");
		System.out.printf("------------------------------\n -1.ERASE YOUR DATA(CAUTION!)\n");
		System.out.println("-----------------------------");
	    System.out.println(" ");
		System.out.println("Please Input Your Choice:");
		int action=input.nextInt();
		return action;
		
		}
	
	
	 //FUNCTION 1 : DIET PLANNER//
	
      public static Object[] Diet() {
		                         welcomeui();
		                         Object[] the_list=dietInputUi();
		                        double dailyIntake=(double) the_list[0];
		                        int size= the_list.length;
		                        the_list[size-1]= displayui(dailyIntake);
		                        return the_list;
		}
      
       //SUB FUNCTION FOR WELCOME UI//
  	   static void welcomeui() {
  		  System.out.printf("%87s", "*--------------------------------------------------*");
  		  System.out.println("");
  		  System.out.println("                                   *       WELCOME TO THE AST10106 DIET PLANNER       * ");
  		  System.out.println("                                   *--------------------------------------------------* ");
  		  System.out.println(" ");
  	}
  	
  	
  	   //SUB FUNCTION FOR GETTING THE USER INFORMATION.//
  	   
		public static Object[] dietInputUi() {
			Scanner data = new Scanner(System.in);
		    String check = "true";
		    String name=" ";
		    String gender = " ";
		    int age=0;
		    int level=0;
		    double weight=0.0;
		    double weight2=0;
		    double workout=0;
		    double height=0.0;
		    
		    String ogname="";
		    String oggender="";
		    String ogage="";
		    String oglevel="";
		    String ogweight2="";
		    
             //writing the data back for retrivinf credentials purpose//
		    try  
		     (BufferedReader isr= new BufferedReader(new FileReader("PlanData.txt"))){	   
			    	while(isr.ready()) {
			    		String letter=isr.readLine();
			    	 if(letter.contains("Name:")) {
			    		ogname= letter.substring(5, letter.length());
			    	 }
			    	 if(letter.contains("Gender:")) {
			    		 oggender=letter.substring(7, letter.length());
			    	 }
			    	 if(letter.contains("Age:")) {
			    		 ogage=letter.substring(4, letter.length());
			    	 }
			    	 if(letter.contains("Sport mode:")) {
			    		 oglevel=letter.substring(11, letter.length());
			    	 }
			    	 if(letter.contains("Demand weight:")) {
			    		 ogweight2=letter.substring(14,letter.length()-4);
			    	 }
			    	}
			           System.out.println();
		}  
			    catch
			          (IOException e) {
			    	System.out.println(e.getMessage());
			    }
		
		    
		    //retriving the past credentials
		    System.out.println("DO YOU WANT TO RETRIVE YOUR PAST CREDENTIALS?");
		    System.out.println("(PRESS 1: FOR RETRIVING || PRESS ANY BUTTON: FOR NOT RETRVING)");
		    System.out.println("");
		    String retrive= data.next();
		    
		    if(retrive.equals("1")&& !ogname.equals("")) {
		    	name= ogname;
		    	gender=oggender;
		    	age=Integer.valueOf(ogage);
		    	level= Integer.valueOf(oglevel);
		    	weight2= Double.valueOf(ogweight2);
		    	
		    	//since Weight and height changes with time//
		    	System.out.println("");
		    	System.out.println("Input Your Current Weight(In Kgs)");
				   System.out.println("(eg.69.70)");
				   System.out.println("-------------------------");
				    weight=0.0;
				   boolean checkWeight= false;
				   while(!checkWeight) {
					   try {
						   weight = data.nextDouble();
						   checkWeight=true;
					   }
					   catch(InputMismatchException e) {
						   System.out.println(("Sorry, the Weight Should be in \"69.9\" Format"));
						   System.out.println("Enter Again: ");
						   data.nextLine();
					   }
				   }
				   System.out.println("");
				   System.out.println("Input Your Current Height(In Cm)");
				   System.out.println("(1 feet=30.8 cm)");
				   System.out.println("------------------------");
				   
				   boolean checkHeight= false;
				   while(!checkHeight) {
					   try {
						   height = data.nextDouble();
						   checkHeight=true;
					   }
					   catch(InputMismatchException e) {
						   System.out.println(("Sorry, the Height Should be in \"184.59\" Format"));
						   System.out.println("Enter Again: ");
						   data.nextLine();
					   }
				   }
		    }
		    
		    
		    else { 
		    	if(ogname.equals("")) {
		    		System.out.println("NO PAST DATA RECORDED!!");
		    	}
		    	else {
		    	System.out.println("");
		    	//deleting the file//
		    	ClearFile();
		    	}
		    	
		    //NAME//
		    System.out.println("");
		    System.out.println("What is Your Name?");
		    System.out.println("(eg.Ip Tsun Ting)");
		    System.out.println("-------------------");
		    name=data.nextLine();
		    name=data.nextLine();
		    
		    //GENDER//
		    while (check.equals("true")) {
			System.out.println("Input Your Gender(M/F)");
			System.out.println("----------------------");
			gender = data.next();
			 if (gender.equals("M") || gender.equals("F") ||gender.equals("m")|| gender.equals("f")) {
				check = "false";
			}
			 }  

		   //WEIGHT//
		   System.out.println("");
		   System.out.println("Input Your Weight(In Kgs)");
		   System.out.println("(eg.69.70)");
		   System.out.println("-------------------------");
		   
		   boolean checkWeight= false;
		   while(!checkWeight) {
			   try {
				   weight = data.nextDouble();
				   checkWeight=true;
			   }
			   catch(InputMismatchException e) {
				   System.out.println(("Sorry, the Weight Should be in \"69.9\" Format"));
				   System.out.println("Enter Again: ");
				   data.nextLine();
			   }
		   }
		    

		   //HEIGHT//
		   System.out.println("");
		   System.out.println("Input Your Height(In Cm)");
		   System.out.println("(1 feet=30.8 cm)");
		   System.out.println("------------------------");
		    height=0.0;
		   boolean checkHeight= false;
		   while(!checkHeight) {
			   try {
				   height = data.nextDouble();
				   checkHeight=true;
			   }
			   catch(InputMismatchException e) {
				   System.out.println(("Sorry, the Height Should be in \"184.59\" Format"));
				   System.out.println("Enter Again: ");
				   data.nextLine();
			   }
		   }
		    
		   
		 
		   
		   //AGE//
		   System.out.println("");
		   System.out.println("Input Your Age(In Years)");
		   System.out.println("(eg. \"17\")");
		   System.out.println("-------------------------");
		   boolean checkAge= false;
		   while(!checkAge) {
			   try {
				   age = data.nextInt();
				   checkAge=true;
			   }
			   catch(InputMismatchException e) {
				   System.out.println(("Sorry, the age Should be in \"15\" Format"));
				   System.out.println("Enter Again: ");
				   data.nextLine();
			   }
		   }
		    
           
		   //DESIRED WEIGHT//
		   System.out.println(" ");
		   System.out.println("Input Your Desired Weight(In Kgs)");
		   System.out.println("(eg. For Current Weight: 72, Desired Weight: 75)");
		   System.out.println("--------------------------------------------------");
		   boolean checkWeight2= false;
		   while(!checkWeight2) {
			   try {
				   weight2 = data.nextDouble();
				   checkWeight2=true;
			   }
			   catch(InputMismatchException e) {
				   System.out.println(("Sorry, the Weight Should be in \"69.9\" Format"));
				   System.out.println("Enter Again: ");
				   data.nextLine();
			   } 
		   }
           
		   //FITNESS LEVEL//
		   boolean checkFit=false;
		   while(!checkFit) {
		   System.out.println(" ");
		   System.out.println("How Much is Your Fitness Level?");
		   System.out.println("|1. Couch Potato | 2.Weekend Warrior | 3.Gym Member | 4.Pro- Athlete| ");
		   System.out.println("---------------------------------------------------------------------");
		   level=data.nextInt();
		   
		   if
		   (level==1|| level==2||level==3|| level==4) {
		   checkFit=true;
	       }
		   
		   if(level!=1&&level!=2&&level!=3&& level!=4) {
			   System.out.println("Sorry, Input Either 1/2/3/4\"");
			   checkFit=false;
			   }
		   
		  }
		  

		   //SUGGESTING THE WORKOUT PLAN TOO//
		  
		   String choice = " ";
		     if (level == 1) { 
			    System.out.println("Do You Want Some Workout Suggestion For More Activity(Yes/No)");
			    choice = data.next();
		       }
		     
		     if ((choice.toUpperCase()).equals("YES")) {
			 workout=workoutPlanner(); 
		       }
		   
		    }	
		    
		  //CALCULATION OF REQUIRED CALORIE //
		     double dailyIntake = calculate(gender, weight, height, age, weight2, level);
	         dailyIntake=dailyIntake+workout;
	         
	         int size=0;
	         Object[] dataArray = {dailyIntake,name,gender,weight,height,age,weight2,level,size};
		     return dataArray; //return to main//
}
		


	        //# SUB FUNCTION FOR CALCULATION//
	        static double calculate(String g, double w, double h, int a, double w2, int lvl) {
		    double BMR = 0; // BMR= Body Metabolism Rate//
		    double TDEE = 0; // TDEE = Total Daily Energy Expenditure//
		    double IdealWeight=0;
		     //1.CALCULATING BMR AS PER THE GENDER//
		    
		     //A.MALE
		     if (g.equals("M") || g.equals("m")) {
			   BMR = 88.362 + (13.397 * w) + (4.799 * h) - (5.677 * a); // this is the formula to calculate BMR for male	
			   IdealWeight= 50+(2.3*((h/2.54)-60)); // and female//
		     } 
		     //B.FEMALE
		     else if (g.equals("F") || g.equals("f")) {
			   BMR = 447.593 + (9.247 * w) + (3.098 * h) - (4.330 * a);
			   IdealWeight= 45.5+(2.3*((h/2.54)-60));
		     }
		     
		    //2.CALCULATING TDEE
		    switch (lvl) {
		    case 1:
			       TDEE = BMR * 1.2; // general formula to calculate according to user's activity daily//
			       break;

		    case 2:
			       TDEE = BMR * 1.375;
			       break;

		    case 3:
			       TDEE = BMR * 1.55;
			       break;

		    case 4:
			       TDEE = BMR * 1.725;
			       break;

		    default:
			       break;
		}
		    
		    
        //3.DETERMINE WEIGHT GAIN OR WEIGHT LOSS
		double wDiff = w - w2;
		double calSurDef = 0; // this all is just a mathematical formula I searched in Google//
		
		if (wDiff > 0) {
			calSurDef = 0.05*TDEE;
		} 
		else {
			calSurDef = 0.06*TDEE;
		}
		
		//for REPORT SECTION//
		double BMI= w/((h/100)*(h/100));
		double WaterIntake= w*(35.00/1000.00);
		
				
		writeReport(BMI, WaterIntake, IdealWeight);
		
        
		//4. DETERMINE THE CALORIE INTAKE
		double dailyIntake = (TDEE + calSurDef);
		return dailyIntake; // return after calculating//
	}
	        
	        
	         static void writeReport(double BMI, double WaterIntake, double IdealWeight) {
	        	try 
				(FileWriter data= new FileWriter("PersonalInfo.txt")) {

				 data.write("YOUR CURRENT BMI: "+String.valueOf(BMI));
				 data.write(System.lineSeparator());
				 data.write("REQUIRED DAILY WATER INTAKE: "+ String.valueOf(WaterIntake)+" LITRES");
				 data.write(System.lineSeparator());
				 data.write("OUR SPECIAL WEIGHT SUGGESTOR: "+String.valueOf(IdealWeight)+" KGs");
				 data.write(System.lineSeparator()); 
	        	}
	        
	        	catch(IOException e) {
	        		System.out.println(e.getMessage());
	        	}
			}

			//B. SUB FUNCTION FOR DISPLAYING DIET
	        
			public static int displayui(double dailyIntake) {
			ProjectData projectData= new ProjectData();
			
			//DECLARING ORIGINAL ARRAY FOR VEG DISH.
			ArrayList<String>nameveg;
			ArrayList<Double>caloriesveg;
			ArrayList<String>notesveg;
			ArrayList<String>typeveg;
			
			//DECLARING ORIGINAL ARRAY FOR NON VEG DISH.
			ArrayList<String>namenonVeg;
			ArrayList<Double>calroiesnonVeg;
			ArrayList<String>notesnonVeg;
			ArrayList<String>typenonVeg;
			
			//DECLARING ARRAY FOR DISHES TO BE PRINTED (FOR MODIFICATION).
			ArrayList<String>nameModify = new ArrayList<>();
			ArrayList<Double>calorieModify=new ArrayList<>();
			ArrayList<String>notesModify=new ArrayList<>();
			
			//no. of dAYS
			int forWrite=1;

			//ASKING VEG OR NON VEG DIET.
			Random random= new Random();
			System.out.println("");
			System.out.println("Your Diet Preference 1.Vegetarian | 2.Non- Vegetarian");
			Scanner data = new Scanner(System.in);
			int choice= data.nextInt();
			System.out.println("");

			
			
			//FINALLY, TIME TO DISPLAY.
			System.out.printf("%72s\n","---------------YOUR DIETS ARE ON THE WAY----------------");
			
			//IMPORTING THE DATA OF VEG DISHES FROM projectData class//
			nameveg=projectData.StoreVegName();
		    caloriesveg=projectData.StoreVegCal();
		    notesveg=projectData.StoreVegNotes();
		    typeveg=projectData.StoreVegType();
		    
		    if(choice==1|| choice==2) {
     		switch(choice){
     		//PRINTING VEG DISHES
				case 1: 
				    String YN="Y";
				    double Calorie=0;        
				    int counter=1;
				    int innercounter=0;
				     forWrite=1;
				    
				    if(dailyIntake<1600 || dailyIntake>3000) {
						System.out.println("Please Consult a Nutrionist Before Going This Rigorous Diet.");
						System.out.println(" ");
					  }
				    
				    //Even if the need is 2900+, the maximum healthy calorie range is 2900// 
				    if(dailyIntake>3000) {
				    	dailyIntake=2900;
				    }
		     
		                 while( YN.toUpperCase().equals("Y")&& counter<=30){  
			               while(Calorie<dailyIntake) { 
			            	   
			        	      innercounter=innercounter+1;
			        	      //for breakfast//
			        	      System.out.println("");
			        	      System.out.println("The Breakfast list for today is: ");
			        	      System.out.println("------------------------");
			        	      while(Calorie<580.9) { //Divding the calories for various meal//
			        	    	int index= random.nextInt(nameveg.size()-2);
			        	    	
			        	    	if(typeveg.get(index).equals("Breakfast")) {    
			        	                  if(nameModify.contains(nameveg.get(index))==false) {
			        	                  System.out.println(innercounter+".> "+nameveg.get(index)+" ");
			        	                  System.out.println("    "+caloriesveg.get(index)+" calories per serving");
			        	                  System.out.println("    "+notesveg.get(index));
			        	                  Calorie= Calorie+caloriesveg.get(index); 
			        	                  System.out.println(" ");
			        	                  innercounter=innercounter+1;
			        	                  nameModify.add(nameveg.get(index));
			        	                  calorieModify.add(caloriesveg.get(index));
					                      notesModify.add(notesveg.get(index));
			        	                  }
			        	    	}
			        	      }
			        	      Calorie=600;
			        	         
			        	      
			        	      //for lunch//
			        	       System.out.println("The Lunch List for today is: ");
			        	       System.out.println("----------------------------");
			        	       while( Calorie<1150) {
			        	    	  int index= random.nextInt(nameveg.size()-2);
			        	    	  
			        	    	  if(typeveg.get(index).equals("Lunch")) {
			        	    		  if(nameModify.contains(nameveg.get(index))==false) {
			        	    		  System.out.println(innercounter+ ".> "+nameveg.get(index)+" ");
					        	      System.out.println("    "+caloriesveg.get(index)+" Calories per Serving");
					        	      System.out.println("    "+notesveg.get(index));
					        	      Calorie= Calorie+caloriesveg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(nameveg.get(index));
						        	  calorieModify.add(caloriesveg.get(index));
						        	  notesModify.add(notesveg.get(index));
					        	    	} 
			        	    	  }
					        	      }
			        	       Calorie=1150;

			        	      //for Snacks
			        	      System.out.println("The Snacks List for today is: ");
			        	      System.out.println("--------------------");
			        	      while( Calorie<=1300) {
			        	    	 int index= random.nextInt(nameveg.size()-2);

			        	    	 if(nameModify.contains(nameveg.get(index))==false) {
			        	    	  if(typeveg.get(index).equals("Snack")) {
			        	    		  System.out.println(innercounter+".> "+nameveg.get(index)+" ");
					        	      System.out.println("    "+caloriesveg.get(index)+" calories per serving");
					        	      System.out.println("    "+notesveg.get(index));
					        	      Calorie= Calorie+caloriesveg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(nameveg.get(index));
						        	  calorieModify.add(caloriesveg.get(index));
						        	  notesModify.add(notesveg.get(index));
					        	    	}
					        	      }
			        	      }
			        	      Calorie=1300;
			        	      
			        	    //for dinner
			        	      System.out.println("The Dinner List is: ");
	        	    		  System.out.println("--------------------");
	        	    		  int loop= 1;
			        	      while(Calorie<dailyIntake&& loop<=2) {
			        	    	int  index= random.nextInt(nameveg.size()-2);
			        	    	
			        	    	if(nameModify.contains(nameveg.get(index))==false) {
			        	    	  if(typeveg.get(index).equals("Dinner")) {
			        	    		  System.out.println(innercounter+".> "+nameveg.get(index)+" ");
					        	      System.out.println("    "+caloriesveg.get(index)+" calories per serving");
					        	      System.out.println("    "+notesveg.get(index));
					        	      Calorie= Calorie+caloriesveg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(nameveg.get(index));
						        	  calorieModify.add(caloriesveg.get(index));
						        	  notesModify.add(notesveg.get(index));
						        	  loop=loop+1;
					        	    	}
			        	    	}
			        	              }
			        	      
			        	      Calorie=dailyIntake;
			        	    }
			               
			               //ASKING FOR MODIFICATION(IF ANY)
			               boolean check= true;
			               boolean check2 = true;
		                    while(check==true) { 
		                    System.out.println(" ");
		                    System.out.println("DO YOU WANT ANY MODIFICATIONS?(Y|N)");
		                    String choiceformod= data.next();
		                    if(choiceformod.toUpperCase().equals("Y")) {
		                    	while(check2==true) {
		                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		                    System.out.println("Do you want to |1.Remove Manual Dish |"
		                    		                           + "| 2.Add Your Own Dish | "
		                    		                           + " | 3.No Further Changes|");
		                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					        int choiceForAdd = data.nextInt();		 
					        if(choiceForAdd==1||choiceForAdd==2) {
       
						    modifyUI(nameModify,calorieModify,notesModify,choiceForAdd);
					        }
					        else
					        	check2=false;
					            check=false;
					        }
		                    	
		                   } 
		                    
		                   else {
							    check=false;
						        } 
		                    }
		                    
		  			      int size=nameModify.size();
		  	          		String[] name= new String[size];
		  	          		String[] notes= new String[size];
		  	          		double[] calorie= new double[size];
		  	          		for (int i=0;i<size;i++) {
		  	          			name[i]=nameModify.get(i);
		  	          			notes[i]=notesModify.get(i);
		  	          			calorie[i]=calorieModify.get(i);  
		  			      }
                        //this is file reading of PlanData.txt to read the no of days//
		  	          	try {
				      		File file = new File("PlanData.txt");
				      		Scanner scan = new Scanner(file);
				      		String the_line="";
				      		int counte=1;
				      		boolean index=true;
				      		while(scan.hasNextLine()&&index==true) {
				      		  the_line=scan.nextLine();
				      		  for(int i=1; i<100;i++) {
				      		  if (the_line.contains("!"+String.valueOf(i))){
	                            String writing= "!"+String.valueOf(i); 
	                            String num= writing.substring(1);
	                            if(!num.isEmpty()) {
				      			forWrite= Integer.valueOf(num)+1;
	                            
	                            }
				      		}
				      		  }
				      		    }
				      		}
		  	          	
				      		catch(Exception e) {
				      			System.out.println(e.getMessage());
				      			
				      		}
		  	          		WriteData(name,notes,calorie,forWrite);
		                     
		  	          		//clearing the past dish list after a loop for better FILE I/O//
		                    nameModify.clear();
  	                        calorieModify.clear();
	                        notesModify.clear();
		                    
		                    //ASKING IF USER WANTS FOR DAY-2/ DAY-3
		                       Calorie=0;
			                   innercounter=0;
			                   System.out.println(" ");
			                   System.out.println("DO YOU WANT DIET FOR MORE DAYS?(Y|N)");  
			                   YN=data.next();
			                   counter++; 
			                   forWrite=forWrite+1;
			                  
				     }
		                 
		                 break;
			        
     		                       
     		
     		
			                   
				case 2:
					
					     //IMPORTING NON VEG DISHES FROM projectData class
					     namenonVeg=projectData.StoreNonVegName();
					     calroiesnonVeg=projectData.StoreNonVegCal();
					     notesnonVeg=projectData.StoreNonVegNotes();
					     typenonVeg=projectData.StoreNonVegType();
					
					     if(dailyIntake<1600|| dailyIntake>3000) {
								System.out.println("Please consult a nutrionist before going this rigorous diet.");
							}
					System.out.println(dailyIntake);
					
					 YN="Y";
				     Calorie=0;        
				     counter=1;
				     innercounter=0;
				     forWrite=1;
				    
				    if(dailyIntake<1600 || dailyIntake>3000) {
						System.out.println("Please Consult a Nutrionist Before Going This Rigorous Diet.");
						System.out.println(" ");
					  }
				    
				    //Even if the need is 2900+, the maximum healthy calorie range is 2900// 
				    if(dailyIntake>3000) {
				    	dailyIntake=2900;
				    }
		     
		                 while( YN.toUpperCase().equals("Y")&& counter<=30){  
			               while(Calorie<dailyIntake) { 
			            	   
			        	      innercounter=innercounter+1;
			        	      //for breakfast//
			        	      System.out.println("");
			        	      System.out.println("The Breakfast list for today is: ");
			        	      System.out.println("------------------------");
			        	      while(Calorie<580.9) { //Divding the calories for various meal//
			        	    	int index= random.nextInt(namenonVeg.size()-2);
			        	    	
			        	    	if(typenonVeg.get(index).equals("Breakfast")) {    
			        	                  if(nameModify.contains(namenonVeg.get(index))==false) {
			        	                  System.out.println(innercounter+".> "+namenonVeg.get(index)+" ");
			        	                  System.out.println("    "+calroiesnonVeg.get(index)+" calories per serving");
			        	                  System.out.println("    "+notesnonVeg.get(index));
			        	                  Calorie= Calorie+calroiesnonVeg.get(index); 
			        	                  System.out.println(" ");
			        	                  innercounter=innercounter+1;
			        	                  nameModify.add(namenonVeg.get(index));
			        	                  calorieModify.add(calroiesnonVeg.get(index));
					                      notesModify.add(notesnonVeg.get(index));
			        	                  }
			        	    	}
			        	      }
			        	      Calorie=600;
			        	         
			        	      
			        	      //for lunch//
			        	       System.out.println("The Lunch List for today is: ");
			        	       System.out.println("----------------------------");
			        	       while( Calorie<1150) {
			        	    	  int index= random.nextInt(namenonVeg.size()-2);
			        	    	  
			        	    	  if(typenonVeg.get(index).equals("Lunch")) {
			        	    		  if(nameModify.contains(namenonVeg.get(index))==false) {
			        	    		  System.out.println(innercounter+ ".> "+namenonVeg.get(index)+" ");
					        	      System.out.println("    "+calroiesnonVeg.get(index)+" Calories per Serving");
					        	      System.out.println("    "+notesnonVeg.get(index));
					        	      Calorie= Calorie+calroiesnonVeg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(namenonVeg.get(index));
						        	  calorieModify.add(calroiesnonVeg.get(index));
						        	  notesModify.add(notesnonVeg.get(index));
					        	    	} 
			        	    	  }
					        	      }
			        	       Calorie=1150;

			        	      //for Snacks
			        	      System.out.println("The Snacks List for today is: ");
			        	      System.out.println("--------------------");
			        	      while( Calorie<=1300) {
			        	    	 int index= random.nextInt(namenonVeg.size()-2);

			        	    	 if(nameModify.contains(namenonVeg.get(index))==false) {
			        	    	  if(typenonVeg.get(index).equals("Snack")) {
			        	    		  System.out.println(innercounter+".> "+nameveg.get(index)+" ");
					        	      System.out.println("    "+calroiesnonVeg.get(index)+" calories per serving");
					        	      System.out.println("    "+notesnonVeg.get(index));
					        	      Calorie= Calorie+calroiesnonVeg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(namenonVeg.get(index));
						        	  calorieModify.add(calroiesnonVeg.get(index));
						        	  notesModify.add(notesnonVeg.get(index));
					        	    	}
					        	      }
			        	      }
			        	      Calorie=1300;
			        	      
			        	    //for dinner
			        	      System.out.println("The Dinner List is: ");
	        	    		  System.out.println("--------------------");
	        	    		  int loop= 1;
			        	      while(Calorie<dailyIntake&& loop<=2) {
			        	    	int  index= random.nextInt(namenonVeg.size()-2);
			        	    	
			        	    	if(nameModify.contains(namenonVeg.get(index))==false) {
			        	    	  if(typenonVeg.get(index).equals("Dinner")) {
			        	    		  System.out.println(innercounter+".> "+namenonVeg.get(index)+" ");
					        	      System.out.println("    "+calroiesnonVeg.get(index)+" calories per serving");
					        	      System.out.println("    "+notesnonVeg.get(index));
					        	      Calorie= Calorie+calroiesnonVeg.get(index); 
					        	      System.out.println(" ");
					        	      innercounter=innercounter+1;
					        	      nameModify.add(namenonVeg.get(index));
						        	  calorieModify.add(calroiesnonVeg.get(index));
						        	  notesModify.add(notesnonVeg.get(index));
						        	  loop=loop+1;
					        	    	}
			        	    	}
			        	              }
			        	      
			        	      Calorie=dailyIntake;
			        	    }
			               
			               //ASKING FOR MODIFICATION(IF ANY)
			               boolean check= true;
			               boolean check2 = true;
		                    while(check==true) { 
		                    System.out.println(" ");
		                    System.out.println("DO YOU WANT ANY MODIFICATIONS?(Y|N)");
		                    String choiceformod= data.next();
		                    if(choiceformod.toUpperCase().equals("Y")) {
		                    	while(check2==true) {
		                    		//giving user a switch option for their personalization//
		                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		                    System.out.println("Do you want to |1.Remove Manual Dish |"
		                    		                           + "| 2.Add Your Own Dish | "
		                    		                           + " | 3.No Further Changes|");
		                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					        int choiceForAdd = data.nextInt();		 
					        if(choiceForAdd==1||choiceForAdd==2) {
       
						    modifyUI(nameModify,calorieModify,notesModify,choiceForAdd);
					        }
					        else
					        	check2=false;
					            check=false;
					        }
		                    	
		                   } 
		                    
		                   else {
							    check=false;
						        } 
		                    }
		                    
		  			      int size=nameModify.size();
		  	          		String[] name= new String[size];
		  	          		String[] notes= new String[size];
		  	          		double[] calorie= new double[size];
		  	          		for (int i=0;i<size;i++) {
		  	          			name[i]=nameModify.get(i);
		  	          			notes[i]=notesModify.get(i);
		  	          			calorie[i]=calorieModify.get(i);  
		  			      }
                        
		  	          	try {
				      		File file = new File("PlanData.txt");
				      		Scanner scan = new Scanner(file);
				      		String the_line="";
				      		int counte=1;
				      		boolean index=true;
				      		while(scan.hasNextLine()&&index==true) {
				      		  the_line=scan.nextLine();
				      		  for(int i=1; i<100;i++) {
				      		  if (the_line.contains("!"+String.valueOf(i))){
	                            String writing= "!"+String.valueOf(i);  
	                            String num= writing.substring(1);
	                            if(!num.isEmpty()) {
				      			forWrite= Integer.valueOf(num)+1;
	                            
	                            }
				      		}
				      		  }
				      		    }
				      		}
		  	          	
				      		catch(Exception e) {
				      			System.out.println(e.getMessage());
				      			
				      		}
                      
		  	          		WriteData(name,notes,calorie,forWrite);
		                     
		  	          		
		                    nameModify.clear();
  	                        calorieModify.clear();
	                        notesModify.clear();
		                    
		                    //ASKING IF USER WANTS FOR DAY-2/ DAY-3
		                       Calorie=0;
			                   innercounter=0;
			                   System.out.println(" ");
			                   System.out.println("DO YOU WANT DIET FOR MORE DAYS?(Y|N)");  
			                   YN=data.next();
			                   counter++; 
			                   forWrite=forWrite+1;
			                  
				     }  
		                 break;
					
		                 
				        default:
					           break;
			}	
      }	
		    return forWrite; 
		}
       
			      //MODIFICATION SECTION
			
			      public static void modifyUI(ArrayList<String>nameModify,ArrayList<Double>calorieModify,ArrayList<String>notesModify,int choiceForAdd) {
			      Scanner data= new Scanner(System.in);
			      System.out.println("                             *******************************************");
			      System.out.println("                             *  Section for modifiations in the Diet   * ");
			      System.out.println("                             *******************************************");
			      
			       //IF USER CHOSES 2 i.e. ADD//
			      if (choiceForAdd == 2) {
					      System.out.println(" ");
					      System.out.println("Input The Name Of The Element You Want To Add");
					      String add= data.nextLine();
	                      nameModify.add(add);
	                      
	                      System.out.println("Input The Amount Of Calorie Too.");
	                      Double addCalorie= data.nextDouble();
	                      calorieModify.add(addCalorie);
	                      System.out.println("------------------------------");
	                      System.out.println("     Modified Dish List: ");
	                      System.out.println("------------------------------");
	                      notesModify.add("N/A");
	                      
							for(int i=0; i<nameModify.size();i++) {
							System.out.println(i+1+".>"+nameModify.get(i));
							System.out.println(calorieModify.get(i));
							System.out.println(notesModify.get(i));
							System.out.println("");
							}
							
			      }

				   else if(choiceForAdd==1) {
					         System.out.println(" ");
					         System.out.println("Which Element Would You Like To Remove?(Input the Index(1/2/3...)) ");
					         int remove= data.nextInt();
					         nameModify.remove(remove-1);
					         System.out.println(" ");
					         System.out.println("--------------------");
					         System.out.println("Modified Dish List:");
					         System.out.println("--------------------");
							 for(int i=0; i<=nameModify.size()-1;i++) {
							 System.out.println("=>"+nameModify.get(i));
							 System.out.println("=>"+calorieModify.get(i));
							 System.out.println("=>"+notesModify.get(i));
							 System.out.println("");
							 }
							 
				     }
      
		    }
			 
	
			
	
	
	          // Section 2//
	          // Work Out Section Starts From here//
			      //secondary workout feature too
	          static double workoutPlanner() {
	        	  
		          //IMPORTING WORKOUTS FROM projectData Class
		          ArrayList<String>names=ProjectData.StoreWorkout();
		          
		          //ASKING HOW MUCH CALORIES BURN TO USER
	              Scanner data= new Scanner(System.in);
	              Random random= new Random();
                  System.out.println("How Much Calories Do You Want To Burn?");
                  double calories= data.nextDouble();
                  
                  
                  //DISPLAYING THE EXERCISES
                  System.out.println(" ");
                  System.out.println("Your Exercises Are:");
                  System.out.println("-------------------");
                  
                  //IF-ELSE IF FOR DISPLAYING AS PER THE REQUIRED BURN//
                  if(calories<=500) {
                	  WriteString("#");
    	                for(int i=1; i<5; i++) {
    	                    int no= random.nextInt(names.size()-1);
    	                    System.out.println("=> "+names.get(no).toUpperCase());
    	                    System.out.println("");
        	                WriteString(names.get(no));
    	                  }
    	              WriteString("$");
                    }
                  
                  else if(calories<=1000&& calories>500) { 
                	  WriteString("#");
    	               for(int i=1; i<8; i++) {
    	            	      int no= random.nextInt(names.size()-1);
    	                      System.out.println("=> "+names.get(no).toUpperCase());
    	                      System.out.println("");
    	                      WriteString(names.get(no));
    	                  }
     	              WriteString("$");
                    }
                  
                  
                   else if(calories>1000) {
                	   WriteString("#");
    	                for(int i=1; i<12; i++) {
    		                   int no= random.nextInt(names.size()-1);
    		                   System.out.println("=> "+names.get(no));
    	                       System.out.println("");
    	                       WriteString(names.get(no).toUpperCase());
    	                   }
    	               WriteString("$");
                    }
                  
                    return calories;
	                }
	        
	        //those File stuff
	          
	        public static void LoadPlan(int forWrite){
	        	Scanner datum= new Scanner(System.in);

	        	if(forWrite==0) {
	        	try {
		      		File data = new File("PlanData.txt");
		      		Scanner scan = new Scanner(data);
		      		while(scan.hasNextLine()) {
		      			String the_line=scan.nextLine();
		      			if(the_line.contains("No of Days:")) {
		      				
		      				forWrite=Integer.valueOf(the_line.substring(11));
		      			}	
		      		}
	        	}
	        	
	        	catch(Exception e) {
	      			System.out.println(e.getMessage());
	      		}
	        	
	        	}
	        	int a =(int)forWrite-1;
	        	if( a!=-1) {
	        	System.out.println("");
	        	System.out.println("IMPORTANT NOTE:");
	        	System.out.println("---------------");
	        	System.out.println("YOU HAVE UNDERGONE "+ a + " DAYS TILL NOW.");
	        	System.out.println("============================================");
	        	System.out.println("");
	        	
	        	}
	        	
	        	else {
	        		System.out.println("YOU HAVE UNDERGONE NO DAYS TILL NOW.");
	        	}
	        	System.out.println("WHICH DAY'S PLAN YOU WANT TO SEE?");
	        	int day= datum.nextInt();
	        	
	        	
	        	//load the plan that stored in PlanData.txt and search by the scanner  the specific lines
	        	//to find the symbol of "!","@","#","$" to get the highest line number that contain those symbol
	        	//and print the within lines
	        	try {
		      		File data = new File("PlanData.txt");
		      		Scanner scan = new Scanner(data);
		      		String the_line="";
		      		int the_sign=1;
		      		int the_sign2=1;
		      		int the_sign3=1;
		      		int the_sign4=1;
		      		int line_no=1;
		      		
		      		while (scan.hasNextLine()) {
		      			the_line=scan.nextLine();
		      			//I added the day day part to let the user see the diet of the specific day//
		      			if (the_line.contains("!"+String.valueOf(day))){
		      				the_sign=line_no;
		      			}
		      			if (the_line.startsWith("@"+String.valueOf(day))){
		      				the_sign2=line_no;
		      			}
		      			if (the_line.startsWith("#"+String.valueOf(day))){
		      				the_sign3=line_no;
		      			}
		      			if (the_line.startsWith("$"+String.valueOf(day))){
		      				the_sign4=line_no;
		      			}
		      			line_no++;
		      		}
		      		
		      		if(the_sign2==1) {  
		      			System.out.println("FRIENDLY REMINDER: YOU ARE YET TO FOLLOW THE DIET FOR THIS DAY !!!");
		      			System.out.println("(PRESS 1 TO CREATE THE DIET)");
		      			System.out.println(" ");
		      		}
		      		
		      		else {
		      		System.out.println(" "); 
		      		System.out.println("THIS IS YOUR DIET PLAN FOR DAY "+String.valueOf(day));
		      		System.out.println("------------------------------");
		      		for (int i=the_sign,j=1,z=1;i<the_sign2-1;i++,j++,z++) {
		      			String line = Files.readAllLines(Paths.get("PlanData.txt")).get(i).toUpperCase();
		      			if (j%3==0) {
		      				System.out.print("->"+"Calories intake:".toUpperCase());
		      			}
			      	    System.out.println("->"+line);
			      	    if (j%3==0) {
				      		System.out.println("");
			      	    }
		      		}
		      		}
	        	  }
	      		catch(Exception e) {
	      			System.out.println(e);
	      		}
	        
	      
	      	}
	      	public static void PersonalInfo(){
	      		int line_no=1;
	      		int the_sign=1;
	      		String wTrack="";
	      		//same as LoadPlan() but just PersonalData category to prevent bug for data overloading(but plan changed)
	      		try {
		      		File data = new File("PlanData.txt");
		      		Scanner scan = new Scanner(data);
		      		String the_line="";
		      		
		      		
		      		while (scan.hasNextLine()) {
		      			the_line=scan.nextLine();
		      			if (the_line.startsWith("*")){
		      				the_sign=line_no;
		      			}
		      			line_no++;
		      			if(the_line.startsWith("Weight:")) {
		      				wTrack=wTrack+the_line.substring(7, 11)+" ";
		      			}
		      			
		      		}
		      		
		      		if(the_sign!=1) {
		      	    System.out.println("");
		      		System.out.printf("%53s","THIS IS YOUR PERSONAL REPORT\n");
		      		System.out.printf("%55s","-----------------------------------\n");
		      		System.out.println("===========================================================");
	      			System.out.println("                    PERSONAL INFORMATIONS");
	      			System.out.println("                    ......................");
		      		for (int i=the_sign;i<the_sign+7;i++) {
		      			String line = Files.readAllLines(Paths.get("PlanData.txt")).get(i);
			      	    System.out.println("=>"+line.toUpperCase());
			      	   
		      		}
		      	}
	      		}
	      		catch(Exception e) {
	      			System.out.println(e);
	      		}
	      		
	      		//for another file//
	      		try {
	      			double BMIpseudo=0.0;
	      			File data = new File("PersonalInfo.txt");
	      			Scanner scan = new Scanner(data);
	      			//printing if only the data is stored in the file//
	      			if(the_sign!=1) {
	      			System.out.println("===========================================================");
	      			System.out.println("                     TRACKER INFORMATIONS");
	      			System.out.println("                    .......................");
	      			while (scan.hasNextLine()) {
		      			String the_line=scan.nextLine();
		      			
		      			if
		      		       (the_line.contains("BMI")){
		      		    	  BMIpseudo=Double.valueOf (the_line.substring(18, the_line.length()-1)); 
		      		       }
		      			if(BMIpseudo>60) {
		      				System.out.println("INPUT YOUR VALID CREDENTIAL.");
		      			}

		      			else {
		      			System.out.println("=>"+the_line.toUpperCase());
		      			}
	      	}
	      			System.out.println("");
	      			
	      			System.out.println("=>"+"YOUR WEIGHT ON THE FIRST DAY: "+ (wTrack.substring(0, 4)));
	      			System.out.println("  "+"YOUR WEIGHT TODAY: "+ (wTrack.substring(wTrack.length()-5, wTrack.length()-1)));
	      			System.out.println("===========================================================");
	      		    System.out.println("");
	      			data.deleteOnExit();
	      			}
	      			//if data is not stored in the file print this warning exception.//
	      			else {
	      				System.out.println("SORRY, WE COULDNOT FIND YOUR MATCHING DATA.");
	      				System.out.println("");
	      			}
	      		}
	      		catch(IOException e) {
	      			System.out.println(e.getMessage());
	      		}
	      	       
	      
	      	}
	      	public static void CreateFile(){
	      		//just a create file function
	      		File data = new File("PlanData.txt");
	      		try {
	      			if (data.exists()==false) {
	      				data.createNewFile();
	      			}
	      		}
	      		catch(IOException e){
	      			System.out.println("error");
	      		}
	      	}
	      	public static void ClearFile() {
	      		//same just a clear file function
	      		try {
	      			PrintWriter data = new PrintWriter("PlanData.txt"); 
	      			data.print("");
	      			data.close();
	      			System.out.println("Succesfully deleted file");
	      		}
	      		catch(Exception e){
	      		}
	      	
	      	
	      	try {
      			PrintWriter data = new PrintWriter("PersonalInfo.txt"); 
      			data.print("");
      			data.close();
      			System.out.println("Succesfully deleted file");
      		}
      		catch(Exception e){
      		}
      	}
	      	public static void WritePersonalData(Object[] x) {
	      		//just simply print out those from the array receive
	      		
	      		try {
	      		PrintWriter write=new PrintWriter(new FileWriter("PlanData.txt",true));
	      		write.println("*");
		      	write.println("Name:"+x[1]);
		      	write.println("Gender:"+x[2]);
		      	write.println("Weight:"+x[3]+"(kg)");
		      	write.println("Height:"+x[4]+"(cm)");
		      	write.println("Age:"+x[5]);
		      	write.println("Demand weight:"+x[6]+"(kg)");
		      	write.println("Sport mode:"+x[7]);
		      	int a=(int)x[8];
		      	write.println("No of Days:"+a );
	      		write.println("----");
	      		write.close();
	      		}
	      		catch(Exception e) {
		      		System.out.println(e.getMessage());
	      		}
	      	
	      	}
	    	public static void WriteData(String[] x,String[] y,double[] z, int count) {
	    		//because of the data receive type so add this new function for just the diet part write data
	    		//simply just receive the 3 arrays and write into plandata.txt
	      		try {
	      		PrintWriter write=new PrintWriter(new FileWriter("PlanData.txt",true));
	      		write.println("!"+String.valueOf(count));
	      		for (int i=0;i<=x.length-1;i++) {
		      		write.println(x[i]);
		      		write.println(y[i]);
		      		write.println(z[i]);
	      		}
	      		write.println("@"+String.valueOf(count));
	      		write.close();
	      		}
	      		catch(Exception e) {
		      		System.out.println("error");
	      		}
	      	}
	    	public static void WriteString(String x) {
	    		//the function used inside the work out part , because of the data at workout is a bit messy
	    		//so just make this function to simply throw in string and done write
	    		try {
		      		PrintWriter write=new PrintWriter(new FileWriter("PlanData.txt",true));
		      		write.println(x);
		      		write.close();
	    		}
	    		catch(Exception e) {
	    			System.out.println(e);
	    		}
	    	}
}
