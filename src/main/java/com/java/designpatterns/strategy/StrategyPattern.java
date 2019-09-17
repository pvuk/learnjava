package com.java.designpatterns.strategy;

/**
 * 
 * @author venkataudaykiranp
 *
 * Ref: <a href="https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/">Strategy Design Pattern</a>
 * 
 * <p><strong>Strategy design pattern</strong> is behavioral design pattern where we choose a specific implementation of <a href="//howtodoinjava.com/java-algorithms-implementations/">algorithm</a> or task in run time – out of multiple other implementations for same task.</p>
 * 
 * <p>The important point is that these implementations are interchangeable – based on task a implementation may be picked without disturbing the application workflow.</p>
 * 
 * <pre>Table of Contents
<a href="#introduction">Introduction</a>
<a href="#design-participants">Design Participants</a>
<a href="#problem-statement">Problem Statement</a>
<a href="#solution">Solution with strategy design pattern</a>
<a href="#strategy-implementation">Code Implementation</a>
<a href="#demo">Demo</a>
<a href="#strategy-examples">Popular Implementations</a>
<a href="#summary">Summary</a>
</pre>
 * 
 * <p><a id="introduction"></a></p>
 * <h2>Introduction</h2>
 * <p>Strategy pattern involves removing an algorithm from its host class and putting it in separate class so that in the same programming context there might be different algorithms (i.e. strategies), which can be selected in runtime.</p>
 * 
 * <p><strong>Strategy pattern</strong> enables a client code to choose from a family of related but different algorithms and gives it a simple way to choose any of the algorithm in runtime depending on the client context.</p>
 * 
 * <h4>Driven by Open/closed Principle</h4>
 * 
 * <p>This pattern is based on <strong>Open/closed principle</strong>. We don’t need to modify the context [closed for modification], but can choose and add any implementation [open for extension].</p>
 * 
 * <p>For example, in <code>Collections.sort()</code> – we don’t need to change the sort method to achieve different sorting results. We can just supply different comparators in runtime.</p>
 * 
 * <p><a id="design-participants"></a></p>
 * <h2>Design Participants</h2>
 * 
 * <p>In Strategy pattern, we first create an <a href="//howtodoinjava.com/object-oriented/understanding-abstraction-in-java/">abstraction</a> of algorithm. This is an interface having the abstract operation. Then we create implementations of this abstraction and these are called strategies.</p>
 * <p>A client will always call the abstraction, and will pass a context object. This context object will decide which strategy to use.</p>
 * 
 * <img src="https://cdn1.howtodoinjava.com/wp-content/uploads/2017/06/Strategy-Pattern-Participants.png"></img>
 * 
 * <p><a id="problem-statement"></a></p>
 * <h2>Problem Statement</h2>
 * 
 * <p>Let’s solve a design problem to understand strategy pattern in more detail.</p>
 * <p>I want to design a social media application which allows me to connect to my friends on all four social platforms i.e. Facebook, Google Plus, Twitter and Orkut (for example sake). Now I want that client should be able to tell the name of friend and desired platform – then my application should connect to him transparently.</p>
 * 
 * <p>More importantly, if I want to add more social platforms into application then application code should accommodate it without breaking the design.</p>
 * 
 * <p><a id="solution"></a></p>
 * <h2>Solution with strategy design pattern</h2>
 * 
 * <p>In above problem, we have an operation which can be done in multiple ways (connect to friend) and user can choose desired way on runtime. So it’s good candidate for strategy design pattern.</p>
 * <p>To implement the solution, let’s design one participant one at a time.</p>
 * 
 * <h4>Class Diagram</h4>
 * <ul><li><strong>ISocialMediaStrategy</strong> – The interface which abstract the operation.</li><li><strong>SocialMediaContext</strong> – The context which determines the implementation.</li><li><strong>Implementations</strong> – Various implementations of <code>ISocialMediaStrategy</code>. E.g. <code>FacebookStrategy</code>, <code>GooglePlusStrategy</code>, <code>TwitterStrategy</code> and <code>OrkutStrategy</code>.</li></ul>
 * <figure id="attachment_8349" aria-describedby="caption-attachment-8349" style="width: 914px" class="wp-caption aligncenter"><img src="https://cdn2.howtodoinjava.com/wp-content/uploads/2017/06/Strategy-Pattern-ClassDiagram.jpg" alt="Strategy Pattern Class Diagram" width="914" height="345" class="size-full wp-image-8349" srcset="https://cdn2.howtodoinjava.com/wp-content/uploads/2017/06/Strategy-Pattern-ClassDiagram.jpg 914w, https://cdn2.howtodoinjava.com/wp-content/uploads/2017/06/Strategy-Pattern-ClassDiagram-300x113.jpg 300w, https://cdn1.howtodoinjava.com/wp-content/uploads/2017/06/Strategy-Pattern-ClassDiagram-768x290.jpg 768w" sizes="(max-width: 914px) 100vw, 914px"><figcaption id="caption-attachment-8349" class="wp-caption-text">Strategy Pattern Class Diagram</figcaption></figure>
 *
 * <p><a id="strategy-examples"></a></p>
 * <h2>Popular Implementations</h2>
 * 
 * <ol><li>Java <code>Collections.sort(list, comparator)</code> method where client actually passes suitable comparator based on the requirement in runtime to the method and the method is generic to accept any comparator type. Based on the comparator being passed, same collection can be sorted differently.</li><li>Appenders, Layouts and Filters in <a href="//howtodoinjava.com/log4j2/">Log4j</a>.</li><li>Layout Managers in UI toolkits.</li></ol>
 * 
 * <h1>Summary</h1>
 * <ul>
 * 	<li>
 * 	This pattern defines a set of related algorithm and encapsulate them in separated classes, and allows client to choose any algorithm at run time.
 * </li>
 * <li>
 * 	It allows to add new algorithm without modifying existing algorithms or context class, which uses algorithm or strategies
 * </li>
 * <li>
 * Strategy is a behavioral pattern in Gang of Four Design pattern list.
 * </li>
 * <li>
 * Strategy pattern is based upon Open Closed design principle of SOLID principals.
 * </li>
 * <li>
 * Combination of Collections.sort() and Comparator interface is an solid example of Strategy pattern.
 * </li>
 * </ul>
 *
 */
public class StrategyPattern {
	
	public static void main(String[] args) {
		SocialMediaStrategyContext sc = new SocialMediaStrategyContext();
		sc.setiSocialMediaStrategy(new TwitterStrategy());
		sc.connnect("MusicDirectorManisharma");
		
		sc.setiSocialMediaStrategy(new InstagramStrategy());
		sc.connnect("Photography");
		
		sc.setiSocialMediaStrategy(new YoutubeStrategy());
		sc.connnect("ETV");
		
		sc.setiSocialMediaStrategy(new Photography500pxStrategy());
		sc.connnect("PhotographyArt");
	}
}
