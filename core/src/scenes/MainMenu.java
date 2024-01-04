package scenes;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.MyGdxGame;


public class MainMenu implements com.badlogic.gdx.Screen{
	MyGdxGame game;
	OrthographicCamera camera;
	Stage stage;
	TextButton button;
	
	public MainMenu(MyGdxGame game){
		this.game = game;
	
				
				camera = new OrthographicCamera();
				camera.setToOrtho(false, 800, 480);
				stage = new Stage(new ScreenViewport());
				Gdx.input.setInputProcessor(stage);
				Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
				button = new TextButton("Click me!", skin);
				Table table = new Table();
		        table.setFillParent(true); // Makes the table take the whole stage
		        table.add(button).center(); // Center the button in the table

		        stage.addActor(table);
				
	}
	
	//runs once before the screen renders and plays out
	@Override
	public void show() {
		button.addListener(new ClickListener() {
		    @Override
		    public void clicked(InputEvent event, float x, float y) {
		    	game.setScreen(new LevelOne(game));
				dispose();
		    }
		});
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		//updates the cameras perspecive if any change happened in last frame
		
		
		
		 Gdx.gl.glClearColor(0, 0, 0, 1);
		    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		    stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		    stage.draw();
			
		
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
		stage.dispose();
		// TODO Auto-generated method stub
		
	}

}
