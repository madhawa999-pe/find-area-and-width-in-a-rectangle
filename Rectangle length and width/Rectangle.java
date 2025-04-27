class Rectangle{
	private double length,width,area;
	
public void setlength(double length){
	if(length>0){
		this.length = length;
	}
	else{
	System.out.println("Length should greater than 0");	
	}
}
public void setwidth(double width){
	if(width>0){
		this.width = width;
	}
	else{
		System.out.println("Width should greater than 0");	
	}
}
public double getarea(){
	return length*width;
	
}
}