public class StudentGrades {
    public float getAverage(int[] marks) {
        long sum = 0;
        long size = marks.length;
        for(int i=0;i<size;i++)
            sum += marks[i];
        return ((float)sum)/((float)size);
    }

    public int getMinimum(int[] marks) {
        int minimum = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i] < minimum)
                minimum = marks[i];

        }
        return minimum;

    }

    public int getMaximum(int[] marks) {
        int maximum = marks[0];
        for(int i=1;i<marks.length;i++){
            if(marks[i] > maximum)
                maximum = marks[i];

        }
        return maximum;
    }

}
