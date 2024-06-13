package projectTest;

import java.util.*;

 public class ProjectData {
   public static ArrayList<Veg>VegDishes;
   public   ArrayList<NonVeg>NonVegDishes;
   
   
    public ProjectData() {
	   this.VegDishes= new ArrayList<>();
	   this.NonVegDishes= new ArrayList<>();
   
 
   
   
	   
	   //VEG DISHES PASSED TO ProjectTest//
	   VegDishes.add(new Veg("Breakfast","Veggie Breakfast Skillet with Potatoes and Eggs", 600 , "Sauté potatoes, bell peppers, onions, and eggs together for a hearty skillet."));
	   VegDishes.add(new Veg("Breakfast", "Vegetarian Breakfast Burrito with Tofu Scramble", 650 , "Fill it with tofu scramble, black beans, cheese, avocado, and salsa."));
	   VegDishes.add(new Veg("Breakfast","Eggs Benedict Florentine", 648.98 , "Enjoy poached eggs and sautéed spinach on an English muffin, topped with rich Hollandaise sauce." ));
	   VegDishes.add(new Veg("Breakfast","Vegetarian Breakfast Hash with Sweet Potatoes and Chickpeas", 650 , "Sauté sweet potatoes, chickpeas, bell peppers, and spices for a flavorful hash." ));
	   VegDishes.add(new Veg("Breakfast","Spinach and Mushroom Breakfast Quesadilla", 600 , "Fill a tortilla with sautéed spinach, mushrooms, cheese, and spices, then grill until crispy." ));
	   VegDishes.add(new Veg("Breakfast","Cheesy Grits with Fried Eggs and Roasted Tomatoes", 643.3 , "Serve creamy cheesy grits topped with fried eggs and roasted tomatoes for a Southern-inspired breakfast." ));
	   VegDishes.add(new Veg("Breakfast","Vegetarian Breakfast Sandwich with Egg, Cheese, Avocado, and Tempeh Bacon", 650 , "Layer scrambled egg, cheese, avocado, and tempeh bacon on a toasted bun for a satisfying sandwich."));
	   VegDishes.add(new Veg("Breakfast","Peanut Butter Banana Protein Pancakes", 600 , "Make protein-packed pancakes with peanut butter, mashed bananas, and whole wheat flour." ));
	   VegDishes.add(new Veg("Breakfast","Vegetable Frittata with Goat Cheese", 650 , "Bake a fluffy frittata filled with mixed vegetables and creamy goat cheese." ));
	   VegDishes.add(new Veg("Breakfast","Savory Veggie Oatmeal Bowl with Sautéed Spinach, Mushrooms, and Fried Egg", 600 , "Cook savory oats and top them with sautéed spinach, mushrooms, and a fried egg for a nutritious breakfast." ));
	   VegDishes.add(new Veg("Breakfast","Cheesy Veggie Breakfast Casserole",698.6 , "Layer shredded potatoes, mixed vegetables, and cheese in a casserole dish and bake until golden and bubbly." ));
	   VegDishes.add(new Veg("Breakfast","Vegetarian Eggs Benedict with Avocado and Tomato", 650 , "Replace the traditional ham with avocado and tomato slices in a classic Eggs Benedict." ));
	   VegDishes.add(new Veg("Breakfast","Stuffed Bell Peppers with Quinoa and Eggs", 580.9 , "Fill bell peppers with cooked quinoa, scrambled eggs, cheese, and herbs, then bake until tender." ));
	   VegDishes.add(new Veg("Breakfast","Ricotta Pancakes with Berry Compote",680 , "Make fluffy ricotta pancakes and serve them with homemade berry compote for a sweet and indulgent breakfast." ));
	   VegDishes.add(new Veg("Breakfast", "Vegetarian Breakfast Tacos with Black Beans and Guacamole", 600 , "Fill soft tortillas with black beans, scrambled eggs, guacamole, and salsa for a flavorful taco breakfast." ));
	   VegDishes.add(new Veg("Breakfast","Hash Brown Casserole with Cheddar Cheese", 648.7, "Combine shredded hash browns, cheddar cheese, and a creamy sauce, then bake until golden and bubbly." ));
	   VegDishes.add(new Veg("Breakfast", "Vegetarian Breakfast Pizza with Eggs, Spinach, and Feta", 650 , "Top a pizza crust with scrambled eggs, sautéed spinach, feta cheese, and herbs, then bake until crispy." ));
	   VegDishes.add(new Veg("Breakfast","Vegetarian Breakfast Sausage and Biscuits", 610 , "Serve vegetarian breakfast sausage patties and flaky biscuits for a comforting and filling breakfast." ));
	   
	   VegDishes.add(new Veg("Lunch","Quinoa Salad", 700, "High protein and fiber, packed with vegetables"));
	   VegDishes.add(new Veg("Lunch","Greek Salad", 650.0, "Refreshing salad with tomatoes, cucumbers, olives, and feta cheese"));
	   VegDishes.add(new Veg("Lunch","Vegetable Stir-Fry", 600.25, "Quick and flavorful dish with assorted vegetables"));
	   VegDishes.add(new Veg("Lunch","Cheesy Vegetable Lasagna", 700, "Indulge in layers of pasta, rich tomato sauce, and cheesy goodness with a vegetable-packed lasagna."));
	   VegDishes.add(new Veg("Lunch","Crispy Tofu and Vegetable Stir-Fry with Noodles", 650, "Savor a flavorful stir-fry with crispy tofu, vibrant vegetables, and noodles for a satisfying meal."));
	   VegDishes.add(new Veg("Lunch","Spinach and Mushroom Stuffed Shells with Alfredo Sauce", 750, "Enjoy stuffed pasta shells filled with a delicious spinach and mushroom mixture, topped with creamy Alfredo sauce."));
	   VegDishes.add(new Veg("Lunch","Vegetable Pot Pie with Flaky Crust", 700, "Delight in a comforting vegetable pot pie with a golden, flaky crust and a savory vegetable filling."));
	   VegDishes.add(new Veg("Lunch","Three Cheese Baked Ziti", 700, "Indulge in a cheesy baked ziti dish with a blend of three delicious cheeses and a rich tomato sauce."));
	   VegDishes.add(new Veg("Lunch","Eggplant Parmesan with Spaghetti", 700, "Enjoy crispy breaded eggplant slices topped with marinara sauce and melted cheese, served with spaghetti."));
	   VegDishes.add(new Veg("Lunch", "Vegetable Enchiladas with Rice and Beans", 650, "Savor delicious vegetable enchiladas filled with a medley of veggies, served with rice and beans."));
	   VegDishes.add(new Veg("Lunch","Mediterranean Stuffed Bell Peppers", 600, "Enjoy bell peppers stuffed with a Mediterranean-inspired filling of couscous, olives, feta cheese, and herbs."));
	   VegDishes.add(new Veg("Lunch","Cheese and Spinach Stuffed Portobello Mushrooms", 550, "Indulge in portobello mushrooms stuffed with a creamy mixture of cheese and spinach, baked to perfection."));
	   VegDishes.add(new Veg("Lunch","Vegetable Fajitas with Guacamole and Tortillas", 650, "Savor sizzling vegetable fajitas served with guacamole, tortillas, and all the flavorful toppings."));
	   VegDishes.add(new Veg("Lunch", "Vegetable Paella", 600, "Enjoy a traditional Spanish paella loaded with colorful vegetables, saffron-infused rice, and savory flavors."));
	   VegDishes.add(new Veg("Lunch","Creamy Broccoli and Cheddar Soup with Bread Bowl", 600, "Delight in a comforting and creamy broccoli and cheddar soup served in a warm bread bowl."));
	   VegDishes.add(new Veg("Lunch", "Vegetable Alfredo Pasta", 650, "Indulge in a creamy Alfredo pasta dish with a medley of sautéed vegetables and a rich, cheesy sauce."));
	   VegDishes.add(new Veg("Lunch","Vegetable and Lentil Shepherd's Pie", 600, "Savor a hearty shepherd's pie made with a flavorful vegetable and lentil filling topped with mashed potatoes."));
	   
	   VegDishes.add(new Veg("Snack","Avocado Toast", 100.8, "Whole grain toast topped with mashed avocado and optional toppings"));
	   VegDishes.add(new Veg("Snack","Quinoa Stuffed Bell Peppers", 150.5, "Bell peppers filled with quinoa, vegetables, and cheese"));
	   VegDishes.add(new Veg("Snack","Veggie Omelette", 158.8, "Protein-packed omelette with assorted vegetables"));
	   VegDishes.add(new Veg("Snack","Black Bean Quesadilla",120 , "Cheesy quesadilla filled with black beans and vegetables"));
	   VegDishes.add(new Veg("Snack","Broccoli and Cheese Stuffed Baked Potato", 118.8, "Baked potato filled with steamed broccoli and melted cheese"));
	   VegDishes.add(new Veg("Snack","Cauliflower Tacos", 150, "Tacos filled with roasted cauliflower and toppings"));
	   VegDishes.add(new Veg("Snack","Tomato Basil Soup", 150, "Classic and comforting soup made with tomatoes and basil"));
	   VegDishes.add(new Veg("Snack","Eggplant Parmesan", 121.5, "Baked eggplant slices topped with marinara sauce and cheese"));
	   VegDishes.add(new Veg("Snack","Mixed Berry Smoothie", 193.6, "Refreshing smoothie with mixed berries, yogurt, and optional sweetener"));
	   VegDishes.add(new Veg("Snack","Cabbage Stir-Fry", 188.5, "Healthy and crunchy stir-fry with cabbage and spices"));
	   VegDishes.add(new Veg("Snack","Vegetable Pad Thai", 120.7, "Classic Thai dish with stir-fried vegetables, rice noodles, and tangy sauce"));
	   VegDishes.add(new Veg("Snack","Stuffed Bell Peppers with Quinoa and Black Beans", 100, "Bell peppers filled with quinoa, black beans, and spices"));
	   VegDishes.add(new Veg("Snack","Tofu Stir-Fry", 100, "Stir-fried tofu rich in protein"));
	   VegDishes.add(new Veg("Snack","Mango Salsa", 100, "Fresh and fruity salsa with mango, tomatoes, onions, and lime juice"));
	   VegDishes.add(new Veg("Snack","Roasted Brussels Sprouts", 150, "Oven-roasted Brussels sprouts with olive oil, salt, and pepper"));
	   
	   VegDishes.add(new Veg("Dinner","Veggie Mix Bhature", 550, "Fiber rich vegetable mix curry with Indian bread."));
	   VegDishes.add(new Veg("Dinner","Zucchini Pancakes", 500, "Healthy and savory pancakes made with grated zucchini"));
	   VegDishes.add(new Veg("Dinner","Sweet Potato and Black Bean Chili", 550, "Hearty and satisfying chili with sweet potatoes and black beans"));
	   VegDishes.add(new Veg("Dinner","Mushroom Risotto", 410, "Creamy and flavorful rice dish with mushrooms"));
	   VegDishes.add(new Veg("Dinner","Cauliflower Rice Stir-Fry", 550, "Stir-fried vegetables with cauliflower rice as a low-carb alternative"));
	   VegDishes.add(new Veg("Dinner","Chickpea Salad Sandwich", 442.8, "Protein-rich salad made with chickpeas, mayo, and vegetables, served in a sandwich"));
	   VegDishes.add(new Veg("Dinner","Lentil Pear Salad", 668, "High in fiber and lentil's protein"));
	   VegDishes.add(new Veg("Dinner","Paneer Tikka Masala With Naan", 650.9,"Creamy and Saucy Taste, High in Protein"));
	   VegDishes.add(new Veg("Dinner", "Vegetarian Lasagna", 770.9, "Layers of pasta, tomato sauce, vegetables, and cheese"));
	   VegDishes.add(new Veg("Dinner","Three Cheese Stuffed Shells", 708, "Jumbo pasta shells stuffed with a blend of ricotta, mozzarella, and Parmesan cheese, baked in marinara sauce"));
	   VegDishes.add(new Veg("Dinner","Cheesy Broccoli and Rice Casserole", 600, "A comforting casserole made with broccoli, rice, and a cheesy sauce"));
	   VegDishes.add(new Veg("Dinner", "Sweet Potato and Black Bean Enchiladas", 620.5, "Filled with sweet potatoes, black beans, and topped with enchilada sauce and cheese"));
	   VegDishes.add(new Veg("Dinner","Chickpea and Vegetable Coconut Curry", 600.0, "A creamy curry made with chickpeas, mixed vegetables, and coconut milk"));
	   VegDishes.add(new Veg("Dinner","Spinach and Ricotta Stuffed Shells", 602.1,"High in Protein and Carbohydrates for instant energy"));
	   VegDishes.add(new Veg("Dinner","Lentil Shepherd's Pie", 650.8, "A hearty dish made with lentils, mashed potatoes, and assorted vegetables"));
	  
	   
       
	   //NON VEG DISHES PASSED TO Project Test//
	   NonVegDishes.add(new NonVeg("Dinner","Grilled Chicken Breast", 200, "Lean and protein-rich"));
	   NonVegDishes.add(new NonVeg("Dinner","Baked Salmon", 250, "Rich in omega-3 fatty acids"));
	   NonVegDishes.add(new NonVeg("Dinner","Turkey Chili", 300, "Low-fat and protein-packed"));
	   NonVegDishes.add(new NonVeg("Dinner","Egg White Omelette", 200, "High-protein"));
	   NonVegDishes.add(new NonVeg("Lunch","Baked Chicken Thighs", 450, "Juicy chicken thighs baked with herbs and spices"));
	   NonVegDishes.add(new NonVeg("Lunch","Chicken Lettuce Wraps", 400, "Protein-packed wraps with tender chicken and fresh lettuce"));
	   NonVegDishes.add(new NonVeg("Breakfast","Lemon Garlic Shrimp", 278, "Zesty shrimp cooked with garlic and lemon juice"));
	   NonVegDishes.add(new NonVeg("Breakfast","Honey Glazed Ham", 600, "Ham coated with a sweet and sticky honey glaze"));
	   NonVegDishes.add(new NonVeg("Lunch","Chicken Alfredo Pasta", 400, "Creamy pasta dish with grilled chicken and Alfredo sauce"));
	   NonVegDishes.add(new NonVeg("Breakfast","Bacon-Wrapped Scallops", 423.5, "Scallops wrapped in crispy bacon"));
	   NonVegDishes.add(new NonVeg("Breakfast","Sausage and Pepper Pizza", 401.5, "Pizza topped with sausage, bell peppers, and melted cheese"));
	   NonVegDishes.add(new NonVeg("Breakfast","Teriyaki Salmon", 610, "Salmon glazed with sweet and savory teriyaki sauce"));
	   NonVegDishes.add(new NonVeg("Breakfast","Salmon Salad", 408, "Fresh salad with grilled or baked salmon, mixed greens, and vinaigrette dressing"));
	   NonVegDishes.add(new NonVeg("Lunch","Tandoori Chicken with naan", 670, "Flavorful and low-fat"));
	   NonVegDishes.add(new NonVeg("Lunch","Lean Beef Stir-Fry", 350, "Tender beef strips stir-fried with vegetables in a savory sauce"));
	   NonVegDishes.add(new NonVeg("Breakfast","Salmon Salad", 403.6, "Fresh salad with grilled or baked salmon, mixed greens, and vinaigrette dressing"));
	   NonVegDishes.add(new NonVeg("Lunch","Steak with Roasted Vegetables", 400, "Grilled steak served with a side of flavorful roasted vegetables"));
	   NonVegDishes.add(new NonVeg("Lunch","Pork Tenderloin with Apple Chutney", 400, "Roasted pork tenderloin served with tangy apple chutney"));
	   NonVegDishes.add(new NonVeg("Lunch","Honey Glazed Ham", 406.5, "Ham coated with a sweet and sticky honey glaze"));
	   NonVegDishes.add(new NonVeg("Lunch","Lamb Kebabs with Squash Steam", 650, "Grilled skewers of tender lamb marinated in aromatic spices"));
	   NonVegDishes.add(new NonVeg("Lunch","Sausage and Pepper Pizza", 600, "Pizza topped with sausage, bell peppers, and melted cheese"));
	   NonVegDishes.add(new NonVeg("Lunch","BBQ Ribs", 400, "Tender and succulent ribs with smoky barbecue sauce"));
	   NonVegDishes.add(new NonVeg("Dinner","Spaghetti Bolognese", 780 , "Classic pasta dish with ground beef or minced meat cooked in a tomato-based sauce served over spaghetti."));
	   NonVegDishes.add(new NonVeg("Lunch","Beef and Vegetable Curry with Rice", 850 , "Slow-cooked beef and vegetables in a flavorful curry sauce, served with rice"));
	   NonVegDishes.add(new NonVeg("Dinner","BBQ Chicken Pizza", 780 , "Pizza topped with BBQ sauce, grilled chicken, red onions, and cheese."));
	   NonVegDishes.add(new NonVeg("Dinner","Chicken Carbonara", 850 , "Creamy pasta dish with chicken, bacon, eggs, Parmesan cheese, and black pepper."));
	   NonVegDishes.add(new NonVeg("Dinner","Chicken Fried Rice", 780 , "Stir-fried rice with chicken, vegetables, and scrambled eggs."));
	   NonVegDishes.add(new NonVeg("Dinner","Beef Burrito", 820 , "Flour tortilla filled with seasoned beef, rice, beans, cheese, and salsa."));
	   NonVegDishes.add(new NonVeg("Dinner","Beef and Broccoli with Rice", 800 , "Tender beef and broccoli florets in a savory sauce, served over steamed rice."));
	   NonVegDishes.add(new NonVeg("Dinner","Chicken Korma with Naan", 830 , "Chicken cooked in a creamy, spiced sauce, served with naan bread."));
	   NonVegDishes.add(new NonVeg("Dinner","Chicken Enchiladas", 790 , "Corn tortillas filled with shredded chicken, cheese, and enchilada sauce, baked until bubbly."));
	   NonVegDishes.add(new NonVeg("Dinner","Chicken Tikka Masala with Rice", 860 , "Grilled chicken in a spicy tomato-based sauce, served with rice."));   
	   NonVegDishes.add(new NonVeg("Breakfast", "Lemon Garlic Shrimp", 478, "Zesty shrimp cooked with garlic and lemon juice"));
	   NonVegDishes.add(new NonVeg("Breakfast", "Honey Glazed Ham", 570.3, "Ham coated with a sweet and sticky honey glaze"));
	   NonVegDishes.add(new NonVeg("Breakfast", "Bacon and Egg Sandwich", 450, "Classic sandwich with crispy bacon and fried egg"));
	   NonVegDishes.add(new NonVeg("Breakfast", "Sausage and Cheese Omelette", 420, "Fluffy omelette filled with sausage and melted cheese"));
	   NonVegDishes.add(new NonVeg("Breakfast", "Chicken Sausage Patties", 480, "Delicious chicken sausage patties with herbs and spices"));
	   NonVegDishes.add(new NonVeg("Lunch", "Chicken Alfredo Pasta", 400, "Creamy pasta dish with grilled chicken and Alfredo sauce"));
	   NonVegDishes.add(new NonVeg("Lunch", "Beef Stir-Fry", 450, "Tender beef strips stir-fried with vegetables in a savory sauce"));
	   NonVegDishes.add(new NonVeg("Lunch", "Fish Tacos", 480, "Soft tortillas filled with grilled fish, coleslaw, and tangy sauce"));
	   NonVegDishes.add(new NonVeg("Lunch", "Chicken Caesar Salad", 420, "Fresh salad with grilled chicken, crispy lettuce, and Caesar dressing"));
	   NonVegDishes.add(new NonVeg("Lunch", "Turkey Club Sandwich", 400, "Triple-layered sandwich with turkey, bacon, lettuce, and tomato"));
	   NonVegDishes.add(new NonVeg("Dinner", "Grilled Salmon", 320, "Fresh salmon fillet marinated and grilled to perfection"));
	   NonVegDishes.add(new NonVeg("Dinner", "Lamb Curry", 450, "Aromatic lamb curry cooked with spices and served with rice or naan bread"));
	   NonVegDishes.add(new NonVeg("Dinner", "Steak with Mushroom Sauce", 500, "Juicy steak topped with creamy mushroom sauce"));
	   NonVegDishes.add(new NonVeg("Dinner", "Stuffed Chicken Breast", 380, "Chicken breast stuffed with spinach, feta cheese, and herbs"));
	   NonVegDishes.add(new NonVeg("Dinner", "Pork Chops with Apple Chutney", 420, "Tender pork chops served with a sweet and tangy apple chutney"));
	   NonVegDishes.add(new NonVeg("Snack", "Buffalo Wings", 280, "Crispy chicken wings tossed in spicy buffalo sauce"));
	   NonVegDishes.add(new NonVeg("Snack", "BBQ Ribs", 500, "Tender pork ribs slow-cooked and glazed with tangy barbecue sauce"));
	   NonVegDishes.add(new NonVeg("Snack", "Chicken Satay Skewers", 320, "Grilled chicken skewers served with peanut sauce"));
	   NonVegDishes.add(new NonVeg("Snack", "Spicy Meatballs", 300, "Savory meatballs simmered in a spicy tomato sauce"));
	   NonVegDishes.add(new NonVeg("Snack", "Teriyaki Beef Jerky", 280, "Thinly sliced beef marinated in teriyaki sauce and dried to perfection"));
	   NonVegDishes.add(new NonVeg("Dinner","Veggie Mix Bhature", 550, "Fiber rich vegetable mix curry with Indian bread."));
	   NonVegDishes.add(new NonVeg("Dinner","Zucchini Pancakes", 500, "Healthy and savory pancakes made with grated zucchini"));
	   NonVegDishes.add(new NonVeg("Dinner","Sweet Potato and Black Bean Chili", 550, "Hearty and satisfying chili with sweet potatoes and black beans"));
	   NonVegDishes.add(new NonVeg("Dinner","Mushroom Risotto", 410, "Creamy and flavorful rice dish with mushrooms"));
	   NonVegDishes.add(new NonVeg("Dinner","Cauliflower Rice Stir-Fry", 550, "Stir-fried vegetables with cauliflower rice as a low-carb alternative"));
	   NonVegDishes.add(new NonVeg("Dinner","Chickpea Salad Sandwich", 442.8, "Protein-rich salad made with chickpeas, mayo, and vegetables, served in a sandwich"));
	   NonVegDishes.add(new NonVeg("Dinner","Lentil Pear Salad", 668, "High in fiber and lentil's protein"));
	   NonVegDishes.add(new NonVeg("Dinner","Paneer Tikka Masala With Naan", 650.9,"Creamy and Saucy Taste, High in Protein"));
	   NonVegDishes.add(new NonVeg("Breakfast","Veggie Breakfast Skillet with Potatoes and Eggs", 600 , "Sauté potatoes, bell peppers, onions, and eggs together for a hearty skillet."));
	   NonVegDishes.add(new NonVeg("Breakfast", "Vegetarian Breakfast Burrito with Tofu Scramble", 650 , "Fill it with tofu scramble, black beans, cheese, avocado, and salsa."));
	   NonVegDishes.add(new NonVeg("Breakfast","Eggs Benedict Florentine", 648.98 , "Enjoy poached eggs and sautéed spinach on an English muffin, topped with rich Hollandaise sauce." ));
	   NonVegDishes.add(new NonVeg("Breakfast","Vegetarian Breakfast Hash with Sweet Potatoes and Chickpeas", 650 , "Sauté sweet potatoes, chickpeas, bell peppers, and spices for a flavorful hash." ));
	   NonVegDishes.add(new NonVeg("Breakfast","Spinach and Mushroom Breakfast Quesadilla", 600 , "Fill a tortilla with sautéed spinach, mushrooms, cheese, and spices, then grill until crispy." ));
	   NonVegDishes.add(new NonVeg("Breakfast","Cheesy Grits with Fried Eggs and Roasted Tomatoes", 643.3 , "Serve creamy cheesy grits topped with fried eggs and roasted tomatoes for a Southern-inspired breakfast." ));
	   NonVegDishes.add(new NonVeg("Breakfast","Vegetarian Breakfast Sandwich with Egg, Cheese, Avocado, and Tempeh Bacon", 650 , "Layer scrambled egg, cheese, avocado, and tempeh bacon on a toasted bun for a satisfying sandwich."));
	   NonVegDishes.add(new NonVeg("Breakfast","Peanut Butter Banana Protein Pancakes", 600 , "Make protein-packed pancakes with peanut butter, mashed bananas, and whole wheat flour." ));
	   NonVegDishes.add(new NonVeg("Breakfast","Vegetable Frittata with Goat Cheese", 650 , "Bake a fluffy frittata filled with mixed vegetables and creamy goat cheese." ));
 }
    
	   public ArrayList<String> StoreVegName() {
		   ArrayList<String>nameveg=new ArrayList<>();
		     for(Veg veg: VegDishes) {
		    	String a=veg.name.toString();
		    	nameveg.add(a);		
		     } 
		     return nameveg;
			}
	   
	   public ArrayList<Double> StoreVegCal() {
		   ArrayList<Double>caloriesveg= new ArrayList<>();
		   for(Veg veg: VegDishes) {
			   double b= veg.Calories;
		    	caloriesveg.add(b);
		   }
		   return caloriesveg;
	   }
	   
	   public ArrayList<String> StoreVegNotes() {
		   ArrayList <String> noteveg=new ArrayList<>();
		   for(Veg veg: VegDishes) {
			   String c= veg.notes;
		    	noteveg.add(c);
		   }
		   return noteveg;
	   }
	   
	   public ArrayList<String>StoreVegType(){
		   ArrayList<String>typeVeg=new ArrayList<>();
		   for(Veg veg: VegDishes) {
			   String c= veg.type;
			   typeVeg.add(c);
		   }
		   return typeVeg;
	   }
	   
	   public ArrayList<String>StoreNonVegName(){
		   ArrayList<String>namenonVeg=new ArrayList<>();
		   for(NonVeg nonveg: NonVegDishes) {
			   String a= nonveg.name.toString();
			   namenonVeg.add(a);
		   }
		   return namenonVeg;
	   }
	   
	   public ArrayList<Double>StoreNonVegCal(){
		   ArrayList<Double>caloriesnonVeg=new ArrayList<>();
		   for(NonVeg nonveg: NonVegDishes) {
			   double b= nonveg.Calories;
			   caloriesnonVeg.add(b);
		   }
		   return caloriesnonVeg;
	   }
	   
	   public ArrayList<String>StoreNonVegNotes(){
		   ArrayList<String>notenonVeg=new ArrayList<>();
		   for(NonVeg nonveg: NonVegDishes) {
			   String c= nonveg.notes.toString();
			   notenonVeg.add(c);
		   }
		   return notenonVeg;
	   }
	   
	   public ArrayList<String>StoreNonVegType(){
		   ArrayList<String>typenonVeg=new ArrayList<>();
		   for(NonVeg nonveg: NonVegDishes) {
			   String c= nonveg.type;
			   typenonVeg.add(c);
		   }
		   return typenonVeg;
	   }
	   
	   public static ArrayList<String>StoreWorkout(){
		   ArrayList<String>StoreWorkout= new ArrayList<>();
		   StoreWorkout.add("Walking");
		   StoreWorkout.add("Jogging in place");
		   StoreWorkout.add("Jumping jacks");
		   StoreWorkout.add("Bodyweight squats");
		   StoreWorkout.add("Wall sits");
		   StoreWorkout.add("Standing calf raises");
		   StoreWorkout.add("Standing forward lunges");
		   StoreWorkout.add("Standing side lunges");
		   StoreWorkout.add("Plank");
		   StoreWorkout.add("Bird dog");
		   StoreWorkout.add("Glute bridges");
		   StoreWorkout.add("Step-ups on a low platform");
		   StoreWorkout.add("Seated leg extensions");
		   StoreWorkout.add("Seated leg curls");
		   StoreWorkout.add("Seated Russian twists");
		   StoreWorkout.add("Standing arm circles");
		   StoreWorkout.add("Tricep dips on a chair");
		   StoreWorkout.add("Bicep curls (with light weights or resistance bands)");
		   StoreWorkout.add("Seated knee extensions");
		   StoreWorkout.add("Seated knee flexions");
		   StoreWorkout.add("Standing toe touches");
		   StoreWorkout.add("Standing heel-to-toe raises");
		   return StoreWorkout;
	   }

	   
     public static class Veg{
	   String name;
	   double Calories;
	   String notes;
	   String type;
   
   
      public Veg(String type,String name, double Calories, String notes) {
	   this.name= name;
	   this.Calories= Calories;
	   this.notes= notes;
	   this.type=type;
     }
  }
   
    public static class NonVeg{
	   String name;
	   double Calories;
	   String notes;
	   String type;
	   
	   public NonVeg(String type,String name, double Calories, String notes) {
		   this.name= name;
		   this.Calories= Calories;
		   this.notes= notes;
		   this.type=type;
     }
   }
    
   
 }   
	   
	    
	    	
	   
	   
  

   
   
   


