package com.mygdx.game.android;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dell on 1/9/2016.
 */
public class Drop extends Game{
    public SpriteBatch batch;
    public BitmapFont font;


    @Override
    public void create() {
        batch = new SpriteBatch();
        //Use LibGDX's default Arial font.
        font = new BitmapFont();

        this.setScreen(new MainMenuScreen(this));
    }


    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
