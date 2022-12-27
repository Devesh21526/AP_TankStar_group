package com.mygdx.game;
//for saved menu in main menu
//completed
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import java.io.Serializable;

public class Savedgames  implements Screen, Serializable {
    final MyGdxGame game;
    Texture Background;
    Texture Logo;

    Texture sg1;
    Texture sg2;
    Texture sg3, sg, backk, creat;
    public Savedgames(final MyGdxGame game){
        this.game=game;
        Background=new Texture("back.png");
        Logo=new Texture("logo.png");
        sg=new Texture("sg.png");
        sg1=new Texture("sgame1.png");
        sg2=new Texture("sgame2.png");
        sg3=new Texture("sgame3.png");
        backk=new Texture("backkey.png");
        creat=new Texture("createn.png");
    }
    public void Startgame(){
        gamscreemImpl gs= new gamscreemImpl(game);
        game.setScreen(gs);
    }
    public void menu(){
        Mainmenu mn=new Mainmenu(game);
        game.setScreen(mn);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.3f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        game.batch.draw(Background,-50,-50,700,600);
        game.batch.draw(Logo, 210, 0 , 200, 100);
        game.batch.draw(sg3, 210, 100 , 200, 100);
        game.batch.draw(sg2, 206, 190 , 206, 105);
        game.batch.draw(sg1, 219, 300 , 189, 90);
        game.batch.draw(sg, 150, 390 , 300, 90);
        game.batch.draw(backk, 24, 407 , 70, 50);
        game.batch.draw(creat, 530, 20 , 120, 90);
        if (Gdx.input.justTouched()) {
            System.out.println("x=" + Gdx.input.getX() + " y=" + Gdx.input.getY());
        }
        if(Gdx.input.isKeyPressed(Input.Keys.P)){
            this.Startgame();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.M) ){
            this.menu();
        }
        game.batch.end();
    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
