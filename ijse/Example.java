import java.util.*;
class Example{
static Scanner input = new Scanner(System.in);	
static String Username = "Admin";
static String Password = "1234";
static String[][] suppliers = new String[0][2];
static String [] itemCategory=new String [0];
static String [] [] ItemCode=new String[0] [6];
public static void LoginPage() {
		    System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\t\tLOGIN PAGE");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			
			
			while(true){
			System.out.print("Enter your Username:  ");
			String name = input.next();
			if(name.equals(Username)){
			while(true){
			System.out.print("Enter your Password:  ");
			String pw = input.next();
			if(pw.equals(Password)){
			clearConsole();
			HomePage();
			
			}else{
			System.out.print("Incorrect password! Try again!! \n ");
			continue ; 
			}
		    }
			}else{
			System.out.println("Invalid Username! Try again!!\n");
			continue;
			}
			}
			}
			
public static void HomePage(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t	WELCOME   TO	IJSE STOCK	MANAGEMENT\t\bSYSTEM");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			System.out.print("[1] Change the Credentials");
			System.out.println("\t\t\t\t[2] Supplier Manage");
			System.out.print("[3] Stock Manage");
			System.out.println("\t\t\t\t\t[4] Log Out");
			System.out.print("[5] Exit the System\n\n");
			System.out.print("Enter The Option To Continue"+">");
			int x=input.nextInt();
			if(x==1){
			clearConsole();
			changeTheCrednetials( Username,Password);
				}else if (x==2){
			clearConsole();
			SupplierManage();
					}else if(x==3){
			clearConsole();
			StockManage();
						}else if (x==4){
			clearConsole();
			LogOut();
							}else if (x==5){
			clearConsole();
			ExitTheSystem();
			}
			}
			
public static void changeTheCrednetials(String Username, String Password){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tCREDENTIAL\t\bMANAGE");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			String [] xr= new String [1];
			while(true){
			System.out.print("Please	Enter  the  user  name  to  verify  it's   you  :");
			String name =input.next();
			if(name.equals(Username)){
			System.out.println("Hey\t"+name);
			break;
			}else{
			System.out.println("invalid user Name. Try again !");
				
			}
			}
			while (true){
			System.out.print("Enter Your current password :");
			String pass= input.next();
			if(pass.equals(Password)){
			System.out.print("Enter your new Password : ");
			String NewPass=input.next();
			break;
			}else{
			System.out.println("Incorrect password.Try again! ");
			}
		}
			System.out.println("Password changed Successfully ! Do you want to go home page (Y/N) ");
			char x= input.next().charAt(0);;
			if(x=='Y'){
				clearConsole();
				HomePage();
				
				}else {
				clearConsole();
			}
	
}
public static void SupplierManage(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tSUPPLIER\t\bMANAGE");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			System.out.print("[1] Add\tSupplier");
			System.out.println("\t\t\t\t\t[2] Update Supplier");
			System.out.print("[3] Delete Supplier");
			System.out.println("\t\t\t\t\t[4] View Supplier");
			System.out.print("[5] Search Supplier");
			System.out.print("\t\t\t\t\t[6] Home Page\n\n" );
			System.out.print("Enter The Option To Continue "+"  >");
			int option;
			do{
			 option=input.nextInt();
			switch(option){
				case 1:
				clearConsole();
				AddSupplier();
				System.exit(0);
				break;
				case 2:
				clearConsole();
				UpdateSupplier();
				System.exit(0);
				break;
				case 3:
				clearConsole();
				DeleteSupplier();
				System.exit(0);
				break;
				case 4:
				clearConsole();
				ViewSuppllier();
				System.exit(0);
				break;
				case 5:
				clearConsole();
				SreachSupplier();
				System.exit(0);
				break;
				case 6:
				clearConsole();
				HomePage();
				System.exit(0);
				break;
				default:
				System.out.println("Wrong input. Try again!  ");
				
					}
			
			} while(option!=6);
		}
public static void AddSupplier(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tAdd\t\bSupplier");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			while (true) {
            System.out.print("Enter Supplier ID: ");
            String supplierId = input.next();

            if (SuppliersId(supplierId)) {
                System.out.println("Supplier Id:"+(supplierId)+"\talready exists.Try another supplier id!");
            } else {
                System.out.print("Enter Supplier Name: ");
                String supplierName = input.next();
				grow();
                suppliers[suppliers.length-1][0] = supplierId;
                suppliers[suppliers.length-1][1] = supplierName;
                

                System.out.println(" added successfully!");

                System.out.print("Do you want to add a new supplier? (yes/no): ");
                

				char x= input.next().charAt(0);;
				if(x=='y'||x=='y'){
				clearConsole();
				AddSupplier();
				
				}else {
				clearConsole();
				SupplierManage();
			}
	
            }
        }
    }
    
			
 
    
public  static boolean SuppliersId(String supplierId) {
        for (int i = 0; i < suppliers.length; i++) {
            if (suppliers[i][0] != null && suppliers[i][0].equals(supplierId)) {
                return true;
            }
        }
        return false;
    }
/*public static boolean items(String itemCategorie){
	for (int i =0;i<itemCategory.length;i++){
		if (itemCategory[i]!=null&& itemCategory[i].equals(itemCategorie)){
			return true;
			}
		
		} return false;
		}    */


public static void grow(){
		String[][] sup = new String[suppliers.length+1][2];
		for(int i = 0 ; i < suppliers.length; i ++){
			sup[i][0] = suppliers[i][0];
			sup[i][1] = suppliers[i][1];
			}
			
			suppliers = sup ;
	}
public static void growItemCategory(){
		String [] xr = new String [itemCategory.length + 1];
			for (int i = 0; i < itemCategory.length; i++) {
				xr[i]=itemCategory[i];
			}
		itemCategory=xr;
	}
public static void growItemCode(){
	String [][] temp=new String [ItemCode.length+1][6];
		for (int i =0; i<ItemCode.length;i++){
			temp[i]=ItemCode[i];
			}
	ItemCode=temp;
	
	
	}
		
public static void UpdateSupplier(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tUpdate\t\bSupplier");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
				while(true){
                System.out.print("Enter the Supplier Id :");
                String SupId=input.next();
                for (int i=0;i<suppliers.length;i++){
                    if (suppliers[i][0].equals(SupId)){S
                      
                        System.out.print("Supplier Id :"+SupId);
                        System.out.println("\nCurrent Supplier Name: " + suppliers[i][1]);
                        System.out.print("\nEnter new Supplier Name: ");
                        String newSupplierName = input.next();
                        suppliers[i][1] = newSupplierName;
						System.out.println(); 
                        System.out.print("Update successdully ! Do you want to update another supplier? (Y/N): ");
                       char option = input.next().charAt(0);
                        
                        if(option=='Y'||option=='y'){
							clearConsole();
                            UpdateSupplier();
                            return;
                        }
                        else if (option=='N'||option=='n'){
						
							clearConsole();
                            SupplierManage();
                        }              
				}
                } System.out.println("can't find supplier id . Try again!");
            }
		}

public static void DeleteSupplier(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tDelete\t\bSupplier");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			while(true){
			System.out.print("Supplier Id :\t");
			String x=input.next();
			for(int i=0;i<suppliers.length;i++){
			if(x.equals(suppliers[i][0])){
				System.out.print("Deleted SuccessFully ! Do\b\byou want to delete another ?(Y?N) ");
				char option = input.next().charAt(0);
				if(option=='Y'||option=='y'){
							clearConsole();
                            DeleteSupplier();
                            break;
							}else if (option=='N'||option=='n'){
							clearConsole();
                            SupplierManage();
                            System.exit(0);
						}
						
					}
			}System.out.println("Can't find supplier Id.try again!");
		}
	}	
			
public static void ViewSuppllier(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tView\t\bSupplier");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		
				System.out.printf("%n+------------------------------------------+%n");
				System.out.printf("|%-10s	 |	%-16s  |	%n	","SUPPLIER ID","SUPPLIER NAME");
				System.out.printf("%n+------------------------------------------+%n");
					while(true){
					for(int i = 0; i < suppliers.length; i++){
					System.out.printf("|   %-10s   |      %-16s    |  %n",suppliers[i][0],suppliers[i][1]);
					}linkSup();
					System.out.println();
					System.out.print(" Do\b\byou want to go Supplier Manage  ?(Y?N) ");
					char option = input.next().charAt(0);
					if(option=='Y'||option=='y'){
							clearConsole();
                            SupplierManage();
                            break;
							}else if (option=='N'||option=='n'){
							clearConsole();
                            ExitTheSystem();
                            System.exit(0);
				}
	}			
}
public static void SreachSupplier(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tSearch\t\bSupplier");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");	
			while(true){
			System.out.print("Supplier Id :\t");
			String x=input.next();
			for(int i=0;i<suppliers.length;i++){
				for(int j=0;j<suppliers[i].length;j++){
			if(x.equals(suppliers[i][0])){
				System.out.println("Supplier Name :"+suppliers[i][j]);
				System.out.print("added SuccessFully ! Do\b\byou want to find another ?(Y?N) ");
				char option = input.next().charAt(0);
				if(option=='Y'||option=='y'){
							clearConsole();
                            
                            break;
							}else if (option=='N'||option=='n'){
							clearConsole();
                            SupplierManage();
                            System.exit(0);
						}
						
					}
			}
			}System.out.println("Can't find supplier Id.try again!");
		}
	}
public static void linkSup(){
		System.out.print("+");
		for(int i = 0; i < 42; i++){
			System.out.print("-");
			try{
			Thread.sleep(10);
			} catch(InterruptedException e){
				System.out.println("Thread interrupted");
			}
		}
		System.out.println("+");
	}	

public static void StockManage(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tSUPPLIER\t\bMANAGE");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			System.out.print("[1] Manage Item  Categories");
			System.out.println("\t\t\t\t\t[2] Add Item");
			System.out.print("[3] Get Item Supplier Wise");
			System.out.println("\t\t\t\t\t[4] View Items");
			System.out.print("[5] Rank Items Per Unit Price");
			System.out.print("\t\t\t\t\t[6] Home Page\n\n");
			System.out.print("Enter The Option To Continue"+">");
			int x=input.nextInt();
			if(x==1){
			clearConsole();
			manageItemCategories();
			System.exit(0);
			}else if (x==2){
			clearConsole();
			addItem();
			System.exit(0);
			}else if(x==3){
			clearConsole();
			getItemSupplierWise();
			System.exit(0);
		    }else if (x==4){
			clearConsole();
			viewItems();
			System.exit(0);
		    }else if (x==5){
			clearConsole();
			rankItems();
			System.exit(0);
			}else if (x==6){
			clearConsole();
			HomePage();
			}else{
			System.out.println("Wrong input !");
			clearConsole();
			StockManage();
		}
}
public static void manageItemCategories(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tMANAGE\tITEM\tCATEGORIES");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			System.out.print("[1] Add\tNew Item Categories");
			System.out.println("\t\t\t\t\t[2] Delete Item Categories");
			System.out.print("[3] Update Item Categories");
			System.out.println("\t\t\t\t\t[4] Stock Management\n\n");
			System.out.print("Enter The Option To Continue "+"  >");
			int option;
			do{
			 option=input.nextInt();
			switch(option){
				case 1:
				clearConsole();
				addNewItemCategories();
				System.exit(0);
				break;
				case 2:
				clearConsole();
				deleteItemCategories();
				System.exit(0);
				break;
				case 3:
				clearConsole();
				updateItemCategories();
				System.exit(0);
				break;
				case 4:
				clearConsole();
				StockManage();
				System.exit(0);
				break;
				default:
				System.out.println("Wrong input. Try again!  ");
				
					}
			
			} while(option!=4);
		}
public static void	addNewItemCategories(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tADD\tNEW \tITEMS \tCATEGORIES");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			 
		while(true){
			boolean flag = false;
			
			System.out.print("Enter the new Item Category: ");
			String itemCatName = input.next();
			
			for (int i = 0; i < itemCategory.length; i++){
				if(itemCatName.equals(itemCategory[i])){
					flag = true;
					break;
				}
			}
			
			if(flag == false){
				growItemCategory();
				
				itemCategory[itemCategory.length-1] = itemCatName;
				System.out.print("added successfully! Do you want to add another category(Y/N)? ");
				
				
				char x= input.next().charAt(0);;
				if(x=='y'||x=='y'){
				clearConsole();
				addNewItemCategories();
				
				}else {
				clearConsole();
				manageItemCategories();
				System.exit(0);
			}
				
				} 
				 }
	}		
public static void 	deleteItemCategories(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tDELETE\t ITEMS\tCATEGORIES");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
	while(true){
			System.out.print("Item Category: :\t");
			String x=input.next();
			for(int i=0;i<itemCategory.length;i++){
			if(x.equals(itemCategory[i])){
				System.out.print("Deleted SuccessFully ! Do\b\byou want to delete another ?(Y?N) ");
				char option = input.next().charAt(0);
				if(option=='Y'||option=='y'){
							clearConsole();
                            deleteItemCategories();
                            break;
							}else if (option=='N'||option=='n'){
							clearConsole();
                            manageItemCategories();
                            System.exit(0);
						}
						
					}
			}System.out.println("Can't find Item Category:.try again!");
		}
	}	
	
public static void 	updateItemCategories(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tUPDATE \tITEMS\tCATEGORIES");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			while(true){
                System.out.print("Enter the Item Category :");
                String itemCatName =input.next();
                for (int i=0;i<itemCategory.length;i++){
                    if (itemCategory[i].equals(itemCatName)){
                      
                       // System.out.print("item  Category :"+itemCatName);
                        System.out.println("\nCurrentitem Cat Name: " + suppliers[i]);
                        System.out.print("\nEnter new item Cat Name: ");
                        String newitemCatName = input.next();
                        itemCategory[i] = newitemCatName;
						System.out.println(); 
                        System.out.print("Update successdully ! Do you want to update another item? (Y/N): ");
                       char option = input.next().charAt(0);
                        
                        if(option=='Y'||option=='y'){
							clearConsole();
                           updateItemCategories();
                            return;
                        }
                        else if (option=='N'||option=='n'){
						
							clearConsole();
                            manageItemCategories();
                        }              
				}
                } System.out.println("can't find item name . Try again!");
            }
			}	
			
			
public static void addItem(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tADD\tITEM");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			while(true){
		if(itemCategory.length == 0){
			System.out.println("OOPS! It seems that don't have any item categories in the system.");
			System.out.print("Do you want to add a new item category?(Y/N) : ");
				
			char ch = input.next().charAt(0);
			if(ch == 'n' || ch == 'N'){
				HomePage();
				return;
			}else if(ch == 'y' || ch == 'Y'){
				clearConsole();
				addNewItemCategories();
				return;
			}
		}else if(suppliers.length == 0){
			System.out.println("OOPS! It seems that don't have any supplier in the system.");
			System.out.print("Do you want to add a new supplier?(Y/N) : ");
				
			char ch = input.next().charAt(0);
			if(ch == 'n' || ch == 'N'){
				HomePage();
				return;
			}else if(ch == 'y' || ch == 'Y'){
				clearConsole();
				AddSupplier();
				return;
			}
		}else{
			growItemCode();
			
			while(true){
				boolean flag = false;
					
				System.out.print("Item Code : ");
				String itemCode=input.next();
					
				for (int i = 0; i < ItemCode.length; i++){
					if(itemCode.equals(ItemCode[i][0])){
						System.out.println("Item Code already exists! Enter Item Code again");
					}
				}
					
				if(flag == false){
					ItemCode[ItemCode.length-1][0] =itemCode;
					break;	
				}
			}
				
			System.out.println();
			System.out.println("Suppliers list : ");
				
			System.out.printf("+------------------+-------------------+-------------------+%n");
			System.out.printf("|     %s      |    %s    |   %s   |%n","   #   ","SUPPLIER ID","SUPPLIER NAME");
			System.out.printf("+------------------+-------------------+-------------------+%n");
				
			for (int i = 0; i < suppliers.length; i++){
				System.out.printf("|    %-10s    |     %-10s    |    %-10s     |%n",(i+1),suppliers[i][0],suppliers[i][1]);
			}
			System.out.printf("+------------------+-------------------+-------------------+%n");
				
			while(true){
				System.out.println();
				System.out.print("Enter the supplier number > ");
		
				int supNum = input.nextInt();
					
				if(supNum > suppliers.length || supNum <= 0){
					System.out.print("Invalid number! Enter again");
				}else{
				ItemCode[ItemCode.length-1][1] = suppliers[supNum-1][0];
					break;
				}
			}
				
			System.out.println();
			System.out.println("Item Categories : ");
				
			System.out.printf("+------------------+-------------------+%n");
			System.out.printf("|     %s      |   %s   |%n","   #   ","CATEGORY NAME");
			System.out.printf("+------------------+-------------------+%n");
				
			for (int i = 0; i < itemCategory.length; i++){
				System.out.printf("|    %-10s    |     %-10s    |%n",(i+1),itemCategory[i]);
			}
			System.out.printf("+------------------+-------------------+%n");

			while(true){
				System.out.println();
				System.out.print("Enter the category number : ");
				int catNum = input.nextInt();
					
				if(catNum > itemCategory.length || catNum <= 0){
					System.out.print("Invalid number.! Enter again..");
				}else{
					ItemCode[ItemCode.length-1][2] = itemCategory[catNum-1];
					break;
				}
			}
			
			System.out.println();
			System.out.print("Description : ");
			String description = input.next();
				
			ItemCode[ItemCode.length-1][3] = description;
			
			while(true){
				System.out.println();
				System.out.print("Unit price : ");
				String price = input.next();
					
				if(Double.parseDouble(price)>0){
					ItemCode[ItemCode.length-1][4] = price;
					break;
				}else{
					System.out.print("Invalid Unit price enter again..\n");
				}
			}
			
			while(true){
				System.out.println();
				System.out.print("Qty on hand : ");
				String qty=input.next();
			
				if(Integer.parseInt(qty)>0){
					ItemCode[ItemCode.length-1][5] = qty;
					break;
				}else{
					System.out.print("Invalid Unit price enter again..\n");
				}
			}
					
				System.out.print("added successfully! Do you want to add another Item(Y/N)? ");
				char ch = input.next().charAt(0);
				if(ch == 'n' || ch == 'N'){
					clearConsole();
					StockManage();
					System.exit(0);
				}else if(ch == 'y' || ch == 'Y'){
				clearConsole();
				addItem();
					
				}
			}
		}	
	}
			
                                
public static void getItemSupplierWise(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tMANAGE\tITEM\tCATEGORIES");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			while (true){
				System.out.print("Enter\t the Supplier Id : ");
				String supId=input.next();
				for (int i=0;i<suppliers.length;i++){
				if (supId.equals(suppliers[i][0])){
					System.out.println("Supplier Name :"+ suppliers[i][1]+"\n\n");
					System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
					System.out.printf("|     %s    |    %s    |     %s    |     %s   |     %s      |%n","ITEM CODE","DESCRIPTION","UNIT PRICE","QTY ON HAND","CATEGORY");
					System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
					
				
			for (int j = 0; j < ItemCode.length; j++){
				if(supId.equals(ItemCode[j][1])){
			System.out.printf("|    %10s    |    %-10s    |    %10s      |    %10s    |    %10s     |%n",ItemCode[j][0],ItemCode[j][3],ItemCode[j][4],ItemCode[j][5],ItemCode[j][2]);
					
					}
				}System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
					
					System.out.print("search successfully! Do you want to another search?(Y/N) ");
					char ch = input.next().charAt(0);
					if(ch == 'n' || ch == 'N'){
						clearConsole();
						StockManage();
						System.exit(0);
					}else if(ch == 'y' || ch == 'Y'){
						clearConsole();
						getItemSupplierWise();
						
				
				
				}
		}
	}System.out.print("can't find supplier id.try again !\n");
}
}
public static void viewItems(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tVIEW\tITEMS");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			for (int i = 0; i < itemCategory.length; i++){
			System.out.println("\n"+itemCategory[i]+":");
			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
			System.out.printf("|        %s       |        %s       |        %s       |        %s      |        %s        |%n","SID","CODE","DESC","PRICE","QTY");
			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
			for (int j = 0; j < ItemCode.length; j++){
				if(ItemCode[j][2].equals(itemCategory[i])){
					System.out.printf("|    %10s    |    %10s     |    %10s     |    %10s     |    %10s     |%n",ItemCode[j][1],ItemCode[j][0],ItemCode[j][3],ItemCode[j][4],ItemCode[j][5]);
				}
			}
			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
		}
		System.out.print("Do you want to go stock manage page?(Y/N)  ");
					
		char ch = input.next().charAt(0);
		if(ch == 'n' || ch == 'N'){
			ExitTheSystem();
		}else if(ch == 'y' || ch == 'Y'){
			StockManage();
			System.exit(0);
			
		}
	}
		
public static void rankItems(){
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
		    System.out.println("\t\t\t\t\tRANK\tITEMS");
			System.out.println("+---------------------------------------------------------------------------------------------------------------+");
			
		String [][] sortedArray = new String[ItemCode.length][6];
		
		for (int i = 0; i < ItemCode.length; i++){
            sortedArray[i] = ItemCode[i];
        }
        
		for (int i = 0; i < ItemCode.length; i++){
			for (int j = 0; j < ItemCode.length-1; j++){
				if(Double.parseDouble(sortedArray[j][4])>Double.parseDouble(sortedArray[j+1][4])){
					String [] temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
				
			}
		}
		
		System.out.println();
		System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+-------------------+%n");
		System.out.printf("|        %s       |        %s       |        %s       |        %s      |        %s        |        %s        |%n","SID","CODE","DESC","PRICE","QTY","CAT");
		System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+-------------------+%n");
		
		for (int i = 0; i < sortedArray.length; i++){
			System.out.printf("|    %10s    |    %10s     |    %10s     |    %10s     |    %10s     |    %10s     |%n",sortedArray[i][1],sortedArray[i][0],sortedArray[i][3],Double.parseDouble(sortedArray[i][4]),sortedArray[i][5],sortedArray[i][2]);
		}
		System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+-------------------+%n");
		System.out.print("Do you want to go stock manage page?(Y/N)  ");
					
		char ch = input.next().charAt(0);
		if(ch == 'n' || ch == 'N'){
			ExitTheSystem();
		}else if(ch == 'y' || ch == 'Y'){
			StockManage();
			System.exit(0);
		
		
		
		
		}
}
public static void LogOut(){
		System.out.print("Do you want to log out ! (Y/N):  ");
			char x= input.next().charAt(0);;
			if(x=='Y'){
				clearConsole();
				LoginPage();
			}else if (x=='N') {
				clearConsole();
				HomePage();
			}

		}
public static void ExitTheSystem(){
		System.out.println("Logging out. Goodbye!");
		System.exit(0);}
			
private final static void clearConsole() {
			final String os = System.getProperty("os.name");
				try {
					if (os.equals("Linux")) {
						System.out.print("\033\143");
						} else if (os.equals("Windows")) {
							new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
							} else {
								System.out.print("\033[H\033[2J");
								System.out.flush();
							}
							} catch (final Exception e) {
						
								System.err.println(e.getMessage());
			}
		}
	
public static void main(String args[]){
			LoginPage();
			HomePage();
		

			}
			}
	

	


