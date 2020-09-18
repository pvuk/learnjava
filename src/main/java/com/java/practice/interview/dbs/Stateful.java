package com.java.practice.interview.dbs;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 20:11
 */
import java.util.Set;
    public class Stateful {
                    private static Set content;
                    public Stateful(Set content) {
                                    this.content = content;
                    }
                    public Set getContent() {
                                    return content;
                    }
                    
                    public static void main(String[] args) {
						Stateful stateful = new Stateful(content);
					}
    }