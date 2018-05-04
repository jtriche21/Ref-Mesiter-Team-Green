package views;

import java.util.ArrayList;

import controllers.IControllerListenerTypeA;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import models.ArgumentRatingModel;

public class GUIFactoryTypeC extends GUIFactoryTypeA implements IGUIFactory{

    ImageView ratingImg;
    
    protected ArgumentRatingModel rating;
    
    public GUIFactoryTypeC(IControllerListenerTypeA listener, String type, 
            String title, String description, ArrayList<String> subItems, 
            ArgumentRatingModel rating) {
        super(listener, type, title, description, subItems);
        
        this.rating = rating;
        setPicture();
    }
    
    @Override
    protected ArrayList<Node> makeCenterList() {
        ArrayList<Node> nodeList = new ArrayList<>();
        HBox centerLayout = new HBox();
        centerLayout.getChildren().add(super.makeCenterList().get(0));
        
        ratingImg = new ImageView();
        
        centerLayout.getChildren().add(ratingImg);
        
        nodeList.add(centerLayout);
        return nodeList;
    }
    
    private void setPicture() {
        Image image;
        
        if(rating == ArgumentRatingModel.ZERO) 
            image = new Image(GUITester.class.getResourceAsStream("ratingSDisagree.png"));
        else if(rating == ArgumentRatingModel.ONE)
            image = new Image(GUITester.class.getResourceAsStream("ratingDisagree.png"));
        else if(rating == ArgumentRatingModel.THREE)
            image = new Image(GUITester.class.getResourceAsStream("ratingAgree.png"));
        else if(rating == ArgumentRatingModel.FOUR)
            image = new Image(GUITester.class.getResourceAsStream("ratingSAgree.png"));
        else
            image = new Image(GUITester.class.getResourceAsStream("ratingNeutral.png"));
        ratingImg.setImage(image);
    }

}
