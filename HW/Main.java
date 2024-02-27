
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {


        //int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals = {{0, 1}, {1, 2}, {2, 3}};
        for (int i = 0; i < intervals.length - 1; i++)
        {
            for (int j = 0; j < intervals.length - i - 1; j++)
            {
                if (intervals[j][0] > intervals[j + 1][0])
                {
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
        if(intervals[0][0]<0||intervals[intervals.length-1][0]>100000)
        {
            System.out.println("Interval Time is invalid");
        }
        else if(intervals.length<=1 || intervals.length>= 1000000) // this yellow line saying the right condition is always true is lying dont trust it
        {
            System.out.println("Interval length is invalid");
        }
        else
        {
            System.out.println(minMeetingRooms(intervals));
        }


    }
    // can use the two sum but if its not found we add it to total sum unless the array is empty? like oh lets say  {5, 10}, {15, 20} boils down to 5 and 5 this is 10 and now we use 10 - master which is 30
    public static int minMeetingRooms(int[][] intervals)
    {
        int totalServers = 0;
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();

        for (int i=0; i<intervals.length;i++)
        {
            int startTime = intervals[i][0];
            int endTime = intervals[i][1];

            while (!endTimes.isEmpty() && endTimes.peek() <= startTime)
            {
                endTimes.poll();
            }
            endTimes.add(endTime);

            if (endTimes.size() > totalServers)
            {
                totalServers = endTimes.size();
            }
        }
        return totalServers;
    }

}