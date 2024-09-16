package problem.medium.files;

public class Main {
    public static void main(String[] args) {
        var assignment = new Files("assignment", ".word", "ABCDEFGH", "homework");
        System.out.println(assignment.getLifetimeBandwidthSize());
        System.out.println(assignment.prependContent("MMM"));
        System.out.println(assignment.addContent("hello world", 5));
        System.out.println(assignment.showFileLocation());


        var blade = new Files("blade", ".txt", "bg-primary text-white m-0 p-0 d-flex justify-content-center", "view");
        System.out.println(blade.getLifetimeBandwidthSize());
        System.out.println(blade.addContent("font-weight-bold ", 11));
        System.out.println(blade.showFileLocation());
    }
}
