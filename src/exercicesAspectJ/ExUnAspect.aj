package exercicesAspectJ;

public aspect ExUnAspect{
	
	pointcut getTimeOfVoid():
		call(public * exercicesAspectJ.ExerciceUn.*()) && args(void);
	
	pointcut getTimeNotVoid(Object a):
		call(public * exercicesAspectJ.ExerciceUn.*(Object)) && args(a);
	
	long around() : getTimeOfVoid(){
		long startTime = System.nanoTime();
		proceed();
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		return endTime - startTime;
	}
		
	long around(Object a) : getTimeNotVoid(a){
		long startTime = System.nanoTime();
		proceed(a);
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		return endTime - startTime;
	}
	
		
}