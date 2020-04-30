/*
 * Francis Bui
 * CMIS 141: Rebecca Rowson
 *
 * Homework 4: State Bird & Flower
 *
 * Description of program: The purpose of this program
 * is to allow the user to enter the state name which
 * the program would output the state bird and flower
 */

public class State {

    private static String[][] stateData = {
            {"Alabama", "Yellowhammer", "Camellia"},
            {"Alaska", "Willow Ptarmigan", "Forget-Me-Not"},
            {"Arizona", "Cactus Wren", "Saguaro Cactus Blossom"},
            {"Arkansas", "Northern Mockingbird", "Apple Blossom"},
            {"California", "California Valley Quail", "Golden Poppy"},
            {"Colorado", "Lark Bunting", "Rocky Mountain Columbine"},
            {"Connecticut", "American Robin", "Mountain Laurel"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"},
            {"Florida", "Northern Mockingbird", "Orange Blossom"},
            {"Georgia", "Brown Thrasher", "Cherokee Rose"},
            {"Hawaii", "Hawaiian Goose", "Hibiscus"},
            {"Idaho", "Mountain Bluebird", "Syringa"},
            {"Illinois", "Northern Cardinal", "Violet"},
            {"Indiana", "Northern Cardinal", "Peony"},
            {"Iowa", "Eastern Goldfinch", "Wild Rose"},
            {"Kansas", "Western Meadowlark", "Sunflower"},
            {"Kentucky", "Northern Cardinal", "Goldenrod"},
            {"Louisiana", "Brown Pelican", "Magnolia"},
            {"Maine", "Black-Capped Chickadee", "White Pine Cone and Tassel"},
            {"Maryland", "Baltimore Oriole", "Black-eyed Susan"},
            {"Massachusetts", "Chickadee", "Mayflower"},
            {"Michigan", "American Robin", "Apple Blossom"},
            {"Minnesota", "Common Loon", "Lady slipper"},
            {"Mississippi", "Mockingbird", "Evergreen Magnolia"},
            {"Missouri", "Eastern Bluebird", "Hawthorn"},
            {"Montana", "Western Meadowlark", "Bitterroot"},
            {"Nebraska", "Western Meadowlark", "Goldenrod"},
            {"Nevada", "Mountain Bluebird", "Sagebrush"},
            {"New Hampshire", "Purple Finch", "Purple Lilac"},
            {"New Jersey", "Eastern Goldfinch", "Purple Violet"},
            {"New York", "Eastern Bluebird", "Rose"},
            {"New Mexico", "Greater Roadrunner", "Yucca"},
            {"North Carolina", "Northern Cardinal", "Dogwood"},
            {"North Dakota", "Western Meadowlark", "Wild Prairie Rose"},
            {"Ohio", "Northern Cardinal", "Scarlet Carnation"},
            {"Oklahoma", "Scissor-tailed Flycatcher", "Mistletoe"},
            {"Oregon", "Western Meadowlark", "Oregon Grape"},
            {"Pennsylvania", "Ruffed Grouse", "Mountain Laurel"},
            {"Rhode Island", "Rhode Island Red", "Violet"},
            {"South Carolina", "Great Carolina Wren", "Carolina Yellow Jessamine"},
            {"South Dakota", "Ring-necked Pheasant", "American Pasqueflower"},
            {"Tennessee", "Northern Mockingbird", "Iris"},
            {"Texas", "Northern Mockingbird", "Bluebonnet"},
            {"Utah", "Common American Gull", "Sego Lily"},
            {"Vermont", "Hermit Thrush", "Red Clover"},
            {"Virginia", "Northern Cardinal", "American Dogwood"},
            {"Washington", "Willow Goldfinch", "Coast Rhododendron"},
            {"West Virginia", "Northern Cardinal", "Rhododendron"},
            {"Wisconsin", "American Robin", "Wood Violet"},
            {"Wyoming", "Western Meadowlark", "Indian Paintbrush"}
    };

    // Other variables
    private String stateName;
    private String stateId;
    private String stateFlower;
    private String stateBird;

    // Constructor
    public State(String inputState) {
        this.stateName = inputState;
    }

    // Various Objects

    // Setter
    public void setState(String stateInput) {
        this.stateId = stateInput;
    }

    public void setStateFlower (String flowerInput) {
        this.stateFlower = flowerInput;
    }

    public void setStateBird(String birdInput) {
        this.stateBird = birdInput;
    }


    // Getter
    public String getState() {
        for (int i = 0; i < stateData.length; i++) {
            if (stateData[i][0].equalsIgnoreCase(this.stateName))
                this.stateId = stateData[i][0];
        }
        return stateId;
    }

    public String getStateFlower() {
        for (int i = 0; i < stateData.length; i++) {
            if (stateData[i][0].equalsIgnoreCase(this.stateName))
                this.stateFlower = stateData[i][2];
        }
        return stateFlower;
    }

    public String getStateBird() {
        for (int i = 0; i < stateData.length; i++) {
            if (stateData[i][0].equalsIgnoreCase(this.stateName))
                this.stateBird = stateData[i][1];
        }
        return stateBird;
    }

}

