public class Main {

    public static void main(String[] args) {
	// write your code here
        Camera cam1 = Camera.getInstance();
        cam1.setCameraName("camara 1");
        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());
    }
}
