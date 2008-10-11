/*
 * Steganography utility to hide messages into cover files
 * Author: Samir Vaidya (mailto:syvaidya@gmail.com)
 * Copyright (c) 2007-2008 Samir Vaidya
 */

package net.sourceforge.openstego.plugin.template.dwt;

/**
 * Object to store FilterGH data
 */
public class FilterGH
{
    /**
     * Constant for filterGH type = Orthogonal
     */
    public static final int TYPE_ORTHOGONAL = 0;

    /**
     * Constant for filterGH type = Bi-orthogonal
     */
    public static final int TYPE_BIORTHOGONAL = 1;

    /**
     * Constant for filterGH type = Other
     */
    public static final int TYPE_OTHER = 2;

    /**
     * Name of the filterGH
     */
    private String name = null;

    /**
     * Type of the filterGH
     */
    private int type = -1;

    /**
     * Filter G
     */
    private Filter g = null;

    /**
     * Filter H
     */
    private Filter h = null;

    /**
     * Filter Gi
     */
    private Filter gi = null;

    /**
     * Filter Hi
     */
    private Filter hi = null;

    /**
     * Get method for name
     * 
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set method for name
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get method for type
     * 
     * @return type
     */
    public int getType()
    {
        return type;
    }

    /**
     * Set method for type
     * 
     * @param type
     */
    public void setType(String type)
    {
        if(type.equalsIgnoreCase("orthogonal"))
        {
            this.type = TYPE_ORTHOGONAL;
        }
        else if(type.equalsIgnoreCase("biorthogonal"))
        {
            this.type = TYPE_BIORTHOGONAL;
        }
        else if(type.equalsIgnoreCase("other"))
        {
            this.type = TYPE_OTHER;
        }
        else
        {
            this.type = -1;
        }
    }

    /**
     * Get method for filter g
     * 
     * @return filter g
     */
    public Filter getG()
    {
        return g;
    }

    /**
     * Set method for filter g
     * 
     * @param g
     */
    public void setG(Filter g)
    {
        this.g = g;
    }

    /**
     * Get method for filter h
     * 
     * @return filter h
     */
    public Filter getH()
    {
        return h;
    }

    /**
     * Set method for filter h
     * 
     * @param h
     */
    public void setH(Filter h)
    {
        this.h = h;
    }

    /**
     * Get method for filter gi
     * 
     * @return filter gi
     */
    public Filter getGi()
    {
        return gi;
    }

    /**
     * Set method for filter gi
     * 
     * @param gi
     */
    public void setGi(Filter gi)
    {
        this.gi = gi;
    }

    /**
     * Get method for filter hi
     * 
     * @return filter hi
     */
    public Filter getHi()
    {
        return hi;
    }

    /**
     * Set method for filter hi
     * 
     * @param hi
     */
    public void setHi(Filter hi)
    {
        this.hi = hi;
    }
}