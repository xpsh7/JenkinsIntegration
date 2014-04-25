package danOrders;



	public class GenericType<T> {
	String r;

		private T t;
		    
		   public T get(){
		       return this.t;
		   }
		    
		   public void set(T t1){
		       this.t=t1;
		   }
		   
		   public T getDriver(){
		       return this.t;
		   }
		    
		   public void setDriver(T t1){
		       this.t=t1;
		   }
		 
		    
		   public void setPass(T t1){
		       this.t=t1;
		   }
		   public T getPass(){
		       return this.t;
		   }
		   
		   public void setUser(T t1){
		       this.t=t1;
		   }
		   public T getUser(){
		       return this.t;
		   }
		    

}
