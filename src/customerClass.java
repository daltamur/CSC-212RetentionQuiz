public class customerClass {
    private groundskeepingClass worker;

    public customerClass(groundskeepingClass worker){
        this.worker=worker;
    }

    public groundskeepingClass retrieveWorker(){
        return worker;
    }

    public void assignWorker(groundskeepingClass workerReplacement){
        this.worker=workerReplacement;
    }
}
