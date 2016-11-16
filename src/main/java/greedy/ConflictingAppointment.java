package greedy;

public class ConflictingAppointment {

    public static void conflictingAppointment(int[] startTime, int[] finishTime, int lastFinsihTime, int currentAppointment) {

        if(currentAppointment == finishTime.length) return;
        if(lastFinsihTime <= startTime[currentAppointment]) {
            System.out.print(currentAppointment + " ");
            lastFinsihTime = finishTime[currentAppointment];
        }

        conflictingAppointment(startTime, finishTime, lastFinsihTime, currentAppointment + 1);
    }

    public static void main(String[] args) {

        int[] startTime = {1, 2, 5, 3, 10, 4};
        int[] finishTime = {5, 6, 6, 7, 15, 100};

        conflictingAppointment(startTime, finishTime, finishTime[0], 1);
    }
}
