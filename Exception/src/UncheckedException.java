
public class UncheckedException {

    //ArrayIndexOutOfBoundsException is one of UncheckedExcetions
    public static double avg(int[] nums) throws ArrayIndexOutOfBoundsException {
        System.out.println("---Begin avg method---");
        double sum = 0;
        for (int index = 0; index <= nums.length; index++) {
            sum += nums[index];
        }
        System.out.println("---End avg method---");
        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println("---Begin Main---");
        
        try {
            double avg = avg(new int[]{1, 2, 3});
            System.out.println("average : " + avg);
        }
        catch(ArrayIndexOutOfBoundsException aio){
            aio.printStackTrace();
        }
        //ต้องเรียงจาก sub ไปกลุ่มใหญ่
        catch(Exception re){
            System.out.println(re.getMessage());
        }
        finally{ //finally ยังไงก็ทำ จะ return ก็ทำ
            System.out.println("finally block is working!!!");
        }
        System.out.println("Good bye, Program");
    }
}
