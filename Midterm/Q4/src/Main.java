public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    private String cameraName; // private

    public String getCameraName() {
        return cameraName;
    }
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private Camera() {}

    private static Camera _Instance;
    public static Camera getInstance() {
        if(_Instance == null) {
            synchronized (Camera.class) {
                if(_Instance == null) {
                    _Instance = new Camera();
                }
            }
        }
        return _Instance;
    }
}
