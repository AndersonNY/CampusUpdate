package ApachePOI;

public class InterviewPrep {

    public class interviewPrep {

        public static void main(String[] args) {

            double answer = getAvg(6);

            System.out.println(answer);

            System.out.println(getTotalOfEvenNumbers(5));

            int [] arr = {2,5,1,3,5,1,2,4,6};

            System.out.println(Arrays.toString(multp(arr)));


            System.out.println("=====>>>>>" + getAverage(123));

        }
        public static double getAvg (int num){

            double average = 0;got
            int total =0;

            for(int i = 1; i <= num; i++){

                total =  total + i;
            }

            average =  (double) total / num;

            return average;
        }

        public static int getTotalOfEvenNumbers(int num){
            int total = 0;

            for(int i = 1; i <= num; i=i+2){

                total=total+i;
            }

            return total;
        }

        public static int getTotalOfEvenNumbers2 (int num){
            int total = 0;

            for(int i = 1; i <= num; i++){
                if(i%2==1){
                    total=total+i;
                }
            }
            return total;
        }

        public static int[] multp (int[] arr){

            int [] answer = new int[arr.length];
            int total = 1;

            for(int i = 0; i<arr.length; i++){
                total = total*arr[i];
            }
            for(int i = 0; i < answer.length; i++){

                answer[i] = total/arr[i];
            }
            return answer;
        }


        public static double getAverage(int num){
            double total = 0;
            int count = 0;

            while(num>0){

                total += num%10;

                num = num / 10;
                count++;
            }

            return  (double) total / count;
        }



} }


///






