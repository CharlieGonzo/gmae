package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;

public class LevelOne implements Screen{
	MyGdxGame game;
	Rectangle player;
	OrthographicCamera camera;
	Texture dropImage;
	final int SCREEN_HEIGHT = 800;
	final int SCREEN_WIDTH = 480;
	
	public LevelOne(MyGdxGame game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCREEN_HEIGHT, SCREEN_WIDTH);
		
		dropImage = new Texture(Gdx.files.internal("drop.png"));
		player = new Rectangle();
		player.x=0;
		player.y=0;
		player.width = 64;
		player.height = 64;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0,0,0.2f,1);
		
		game.batch.setProjectionMatrix(camera.combined);
		
		game.batch.begin();
		game.batch.draw(dropImage,player.x,player.y,player.width,player.height);
		game.batch.end();
		if(Gdx.input.isKeyPressed(Keys.W)) {
			player.y += 5;
			
		}
		if(Gdx.input.isKeyPressed(Keys.A)) {
			player.x -= 5;
			
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			player.y -= 5;
			
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			player.x += 5;
			
		}
	
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
