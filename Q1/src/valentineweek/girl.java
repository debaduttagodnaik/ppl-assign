/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentineweek;

/**
 *
 * @author Debadutta Godnaik
 */
public class girl {
    public String name;
    public int attract_rating;
    public double maintenance_budget;
    public int intel_level;
    public char criteria;
    public char commit;
    public String commit_type;
    public girl(String name,int attract_rating,double maintenance_budget,int intel_level,char criteria,String commit_type)
    {
        this.name = name;
        this.attract_rating = attract_rating;
        this.maintenance_budget  = maintenance_budget;
        this.intel_level = intel_level;
        this.criteria = criteria;
        this.commit = 'N';
        this.commit_type = commit_type;
    }
    
}
