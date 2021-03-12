package game;

import java.awt.*;

public class GamePanel extends Component {


    public GamePanel() {

    }

    public void paint(Graphics g) {

        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 9; col++) {

                this.renderGameTile();
                GameTile tile=new GameTile();
                tile.render();
            }
        }
    }

    private void renderGameTile() {
    }

}








