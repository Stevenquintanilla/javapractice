package javapractice;

public class PaintJob {
	
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        if (width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0) {
            return -1;
        }
        
        double currentAmountOfBuckets = extraBuckets;
        double wallArea = width * height;
        double sum = 0;
        
        while(sum < wallArea) {
            currentAmountOfBuckets++;
            sum = areaPerBucket * currentAmountOfBuckets;
        }
        
        double bucketsNeeded = currentAmountOfBuckets - extraBuckets;
        
        return (int) Math.ceil(bucketsNeeded);
        
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
    	if (width < 0 || height < 0 || areaPerBucket < 0) {
            return -1;
        }
        
        double currentAmountOfBuckets = 0;
        double wallArea = width * height;
        double sum = 0;
        
        while(sum < wallArea) {
            currentAmountOfBuckets++;
            sum = areaPerBucket * currentAmountOfBuckets;
        }
        
        double bucketsNeeded = currentAmountOfBuckets;
        
        return (int) Math.ceil(bucketsNeeded);
    }
    
    public static int getBucketCount(double wallArea, double areaPerBucket) {
    	if (wallArea < 0 || areaPerBucket < 0) {
            return -1;
        }
        
        double currentAmountOfBuckets = 0;
        double sum = 0;
        
        while(sum < wallArea) {
            currentAmountOfBuckets++;
            sum = areaPerBucket * currentAmountOfBuckets;
        }
        
        double bucketsNeeded = currentAmountOfBuckets;
        
        return (int) Math.ceil(bucketsNeeded);
    }
    
    
    public static void main(String[] args) {
		System.out.println(getBucketCount(3.4, 1.5));
	}
}