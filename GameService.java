package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author daevtwymon@gmail.com
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;
	private static long nextPlayerId = 1;
	private static long nextTeamId = 1;

	// FIX ME: Add missing pieces to turn this class a singleton 

	private static GameService getInstance = null;
    private GameService (){
    }
    public static GameService getInstance(){
        if (getInstance == null) {
          getInstance = new GameService();

        }
        return getInstance;
    }
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIX ME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
        for (Game g : games){
            if (g.getName().equals(name)) {
                game = g;
                break;
            }
        }
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}
		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
       for (Game g : games){
         if (g.getId() == id){
           game = g;
           break;
         }
       }
		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIX ME: Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable

      for (Game g: games){
        if (g.getName().equals(name)){
          game = g;
          break;
        }
      }
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
		
	}
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
	public long getNextTeamId() {
		return nextTeamId++;
	}
}
