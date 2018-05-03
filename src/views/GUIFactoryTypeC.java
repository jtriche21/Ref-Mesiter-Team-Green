package views;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class GUIFactoryTypeC extends GUIFactoryTypeA implements IGUIFactory{

    ImageView ratingImg;
    
    public GUIFactoryTypeC(String type, String title, String description, ArrayList<String> subItems) {
        super(type, title, description, subItems);
    }
    
    @Override
    protected ArrayList<Node> makeCenterList() {
        ArrayList<Node> nodeList = new ArrayList<>();
        HBox centerLayout = new HBox();
        centerLayout.getChildren().add(super.makeCenterList().get(0));
        
        ratingImg = new ImageView();
        Image image = new Image(GUITester.class.getResourceAsStream("ratingHolder.png"));
        ratingImg.setImage(image);
        centerLayout.getChildren().add(ratingImg);
        
        nodeList.add(centerLayout);
        return nodeList;
    }

}
