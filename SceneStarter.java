public class SceneStarter{
    public static void main(String[] args){
        SceneFrame sceneFrame = new SceneFrame(1064, 768);
        sceneFrame.setUpGUI();
        sceneFrame.setUpListeners();
    }
}