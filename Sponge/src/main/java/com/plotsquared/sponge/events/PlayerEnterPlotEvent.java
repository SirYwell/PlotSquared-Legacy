package com.plotsquared.sponge.events;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.cause.Cause;

import com.intellectualcrafters.plot.object.Plot;

public class PlayerEnterPlotEvent extends PlayerEvent {
    
    private final Plot plot;
    
    /**
     * PlayerEnterPlotEvent: Called when a player leaves a plot
     *
     * @param player Player that entered the plot
     * @param plot   Plot that was entered
     */
    public PlayerEnterPlotEvent(final Player player, final Plot plot) {
        super(player);
        this.plot = plot;
    }
    
    /**
     * Get the plot involved
     *
     * @return Plot
     */
    public Plot getPlot() {
        return plot;
    }
    
    @Override
    public Cause getCause() {
        return null;
    }
}
