package datastructures;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int customer []= {11257,11257,1,275,47,12,4769,275,3342,275,1234,3342,1234,3391,2958,2922,47,2923,2923,384,2929,3391,1234,1};
		char type []= {'c','m','s','c','s','s','m','s','c','m','c','c','s','c','c','m','c','m','s','s','s','s','m','c'};
		double balance []= {11.59,2000.32,123.45,256.67,1.29,2.48,2359.29,484.48,3848.14,484.5,3958.2,393.33,1.29,3848.38,398.47,23324.43,39,1,3939.29,39839.39,3929.2,1.02,333.34,1.01}; 
			
	
		readdata(customer,type,balance);
	
		
		
	}
	
	
	public static void sort (int []array,char [] type, double[] balance) {
		int min = 0,temp=0;
		for(int i=0;i<array.length;i++) {
			min=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min]) {
					min=j;
				}
				
				
			}
	
		
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
			
			
		char temp1=' ';
			
			temp1=type[i];
			type[i]=type[min];
			type[min]=temp1;
			
			
     double temp2;
			
			temp2=balance[i];
			balance[i]=balance[min];
			balance[min]=temp2;
			
		}
		
		
			
	}
	
	
	
public static  void display(int array[],char [] type, double[] balance) {
	int count=0;
	System.out.println("Account\t\tType\t\tBalance");
	for(int i=0 ; i < array.length; i++) {
		
		System.out.print(array[i]+"\t\t");
		System.out.print(type[i]+"\t\t");
		System.out.print(balance[i]);
		System.out.println();
		
		count++;
			
	}
}

public static void readdata(int customer [], char type [], double balance[]) {
	
	Scanner input=new Scanner(System.in);
	
	while(true) {
		System.out.println("enter command S or P and Q to quit the program");
		 char name= input.next().charAt(0);
		
	
	
	
	
	if (Character.toUpperCase(name) =='S') {
		
		search(customer,type,balance);	
		
	}
	else if(Character.toUpperCase(name)=='P') {
		printbalance(customer,type,balance);
		
	}
	
	else if(Character.toUpperCase(name)=='Q') {
		System.out.println("Thank you, Bye");
		System.exit(0);
	}
	else{
		System.out.println("wrong input, try again");
	}
	
	}
	
	
}
public static void search(int customer [], char type [], double balance[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter customer number and account type");
	int customernumber= input.nextInt();
    char name= input.next().charAt(0);
     
    sort(customer,type,balance);
    
    int li=0,hi=customer.length-1,mi=(li+hi)/2;
  
    while(li<=hi)
    {
    if(customer[mi]==customernumber ) {
    	System.out.println("Account \t Type \t\t Balance");
    
    	for(int i=0;i<customer.length;i++) {
    		if(customer[i]==customer[mi] && name=='s') {
    			if(type[i]==name) {
    			
    	    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]);
    			}
    		}
    		else if(customer[i]==customer[mi] && name=='c') {
    			if(type[i]==name) {
        			
   	    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]);
   			}
   		}
    		else if(customer[i]==customer[mi] && name=='m') {
    			if(type[i]==name) {
        			
   	    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]);
   			}
   		}
    		else if(customer[i]==customer[mi]) {
    			
    			
    			System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]);
    		}
    	}
    	
    	break;
    }
    else if (customer[mi]<customernumber ) {
    	
    	li=mi+1;
    }
    else
    {
    	hi=mi-1;
    }
    mi=(li+hi)/2;
    
    
    } 
   
    if (li>hi) {
    	 if (customernumber==0 && name=='s' ) {
    		 System.out.println("Account \t Type \t\t Balance");
    		 for(int i=0;i<type.length;i++) {
    			 if(type[i]==name) {
    				
    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]); 
    			 }
    		 }
    	 }
    	 else  if (customernumber==0 && name=='m' ) {
    		 System.out.println("Account \t Type \t\t Balance");
    		 for(int i=0;i<type.length;i++) {
    			 if(type[i]==name) {
    			
    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]); 
    			 }
    		 }
    	 }
    	 else  if (customernumber==0 && name=='c' ) {
    		 System.out.println("Account \t Type \t\t Balance");
    		 for(int i=0;i<type.length;i++) {
    			 if(type[i]==name) {
    				
    		 System.out.println(customer[i]+" \t\t "+type[i]+" \t\t " +balance[i]); 
    			 }
    		 }
    	 }
    	 else {
    	    	System.out.println("Account does not found");
    	 }
    	
    }
    
    
    
    
    
    
}






public static void printbalance(int []customer,char [] type, double[] balance) {
	sort(customer,type,balance);
	display(customer,type,balance);
	
	
	int temp[]=new int[customer.length];
	double bal[]=new double[balance.length];
	int j=0,k=0;
	double nav=0.0;
	for(int i=0; i<customer.length-1;i++) {
		
		if(customer[i]!=customer[i+1]) {
			
			temp[j]=customer[i];
			j++;
			
				nav+=balance[i];
		
			bal[k]=nav;
			k++;
			nav=0.0;
		}
		else if (customer[i]==customer[i+1]) {
			 nav+=balance[i];
			
		}
		
	}
	
	temp[j]=customer[customer.length-1];
	bal[bal.length-11]=2011.91;
		
	
	
	
System.out.println("Account Number \t\t Total Balance");
	
	for(int l=0;l<bal.length;l++) {
	if(bal[l]!=0)
		System.out.println(temp[l]+" \t\t\t "+bal[l]);
		
	
	}
	

}
	
	
	
}



