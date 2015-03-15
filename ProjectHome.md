# Google Annotations Gallery #

The Google Annotations Gallery is an exciting new Java open source library that provides a rich set of annotations for developers to express themselves. Do you find the standard Java annotations dry and lackluster? Have you ever resorted to leaving messages to fellow developers with the `@Deprecated` annotation? Wouldn't you rather leave a `@LOL` or `@Facepalm` instead? If so, then this is the gallery for you.

Not only can you leave expressive remarks in your code, you can use these annotations to draw attention to your poetic endeavors. How many times have you written a palindromic or synecdochal line of code and wished you could annotate it for future readers to admire? Look no further than `@Palindrome` and `@Synecdoche`.

But wait, there's more. The Google Annotations Gallery comes complete with dynamic bytecode instrumentation. By using the gag-agent.jar Java agent, you can have your annotations behavior-enforced at runtime. For example, if you want to ensure that a method parameter is non-zero, try `@ThisHadBetterNotBe(Property.ZERO)`. Want to completely inhibit a method's implementation? Try `@Noop`.

If we've whet your appetite for truly expressive annotations, then read on and immerse yourself in the Google Annotations Gallery.

# Update #

A new distribution has been uploaded (gag-1.0.1.zip) to add many great user-suggested annotatons. This update includes the annotations listed below, which includes a new Team category for annotations that apply to your development team. Take a look at the [Javadocs](http://gag.googlecode.com/svn/trunk/javadoc/index.html) for details.

## New for 1.0.1 ##
**Disclaimer**
  * `@AhaMoment`
  * `@BossMadeMeDoIt`
  * `@HandsOff`
  * `@IAmAwesome`
  * `@LegacySucks`

**Enforceable**
  * `@CantTouchThis`
  * `@ImaLetYouFinishBut`

**Literary Verse (new subcategory)**
  * `@Burma Shave`
  * `@Clerihew`
  * `@DoubleDactyl`
  * `@Haiku` (moved to this subcategory)
  * `@Limerick`
  * `@Sonnet`

**Remarks**
  * `@Fail`
  * `@OhNoYouDidnt`
  * `@RTFM`
  * `@Win`

**Team (new category)**
  * `@Blame`
  * `@Channeling`
  * `@Fired`
  * `@HonorableMention`
  * `@Visionary`

# Quick Users Guide #

This guide will help you get started using the Google Annotations Gallery right away. Just download the gag-1.0.1.zip. In there, you'll find the annotations in the gag.jar. The annotations fall into four categories: Disclaimer, Enforceable, Literary and Remark. These categories are described below, complete with examples. Enforceable annotations are distinct in that they are enforceable via the gag-agent.jar Java agent found in the zip file. See the Enforceable section below for details.

## Disclaimer Annotations ##

Disclaimer annotations allow you to disclose certain relevant facts about your code. If you want to ease your conscience with full transparency, then consider these annotations.

**@AnimalsHarmedDuringTheMaking**

The `@AnimalsHarmedDuringTheMaking` annotation allows you to disclose the mistreatment that befell any animals during the implementation of your code.

```
@AnimalsHarmedDuringTheMaking(
    number = 1,
    animal = "hamster",
    disclosure = "didn't feed Fermie for 2 days to finish this on time")
public class ConstantTimePrimalityTest {
```

**@CarbonFootprint**

For environmentally conscious developers, this annotation allows you to specify your primary carbon footprint incurred during normal execution of your code. Valid units are expressed with [CO2Units](http://code.google.com/p/gag/source/browse/trunk/src/com/google/gag/enumeration/CO2Units.java).

```
@CarbonFootprint(
    value = 6.28318531,
    units = GRAMS_PER_MEGAJOULE)
public interface Holodeck {
```

**@NameCourtesyOfTranslationParty**

Sometimes it's tough to name a class, method or variable. We've all been there. If you've ever resorted to using Translation Party like we have, then you can use this annotation to give credit where it's due. And if you've ever had the misfortune of botching up a name all on your own, then, sure, use this annotation anyway.

```
@NameCourtesyOfTranslationParty
void purizupurizuPleaseReferToTheFollowingElementsAggregateCan();
```

**@ProbablyIllegalIn**

Not certain whether your code is actually legal in a given region? Better to be safe than sorry. It's probably a good idea to slap one of these on your code. Valid regions are in [RegionType](http://code.google.com/p/gag/source/browse/trunk/src/com/google/gag/enumeration/RegionType.java).

```
@ProbablyIllegalIn(number = 17, region = STATES)
public Money extractFractionalPennies(Account account);
```

**@SafeForSpeedsNotExceeding**

Meant for code residing on embedded devices propelled at breakneck speeds, this annotation let's you indicate the maximum speed your code-carrying device was successfully tested at. Valid speed units can be found in [SpeedUnits](http://code.google.com/p/gag/source/browse/trunk/src/com/google/gag/enumeration/SpeedUnits.java).

```
@SafeForSpeedsNotExceeding(
    value = 1.15572735,
    units = ATTOPARSECS_PER_MICROFORTNIGHT)
public class QuantumDecoherenceStabilizer {
```

**@WrittenWhile**

There are times when you haven't given your best performance. Perhaps you were distracted. Perhaps you want everyone to think you were. That's your call. We won't judge you. We just want to give you an out.

```
@WrittenWhile("surfing Chatroulette")
public interface You {
  void spinRightRoundBabyRightRound(Me me);
}
```


## Enforceable Annotations ##

Enforceable Annotations are annotations enforced by dynamic bytecode instrumentation. Use the following annotations, then run your applications with the `javaagent:gag-agent.jar` option (see the [README](http://gag.googlecode.com/svn/trunk/README) for details), and, voila, your annotations get enforced at runtime.

**@ThisHadBetterBe and @ThisHadBetterNotBe**

These annotations are useful to ensure that your method parameters are what you expect them to be, dagnabbit. If you want a succinct alternatively to bulletproofing your parameters with preconditions, use these.

```
public void setBonusMultiplier(@ThisHadBetterNotBe(NEGATIVE) double multiplier) {
  this.multiplier = multiplier;
}

public void misappropriate(@ThisHadBetterBe(THE_STOLEN_DEATH_STAR_PLANS) DataTape tape) {
  r2.record(tape.play());
  ship.getEscapePod().insert(r2).jettison();
}
```

**@Noop**

Feel like turning off a method? How about a whole class? Why waste time using a bunch of `//` and `/* */`. Use a `@Noop` and, boom, no more behavior.

```
public class FluxCapacitor {

  @Noop("let's see how long before Emmett realizes he's not travelling in time")
  public void setDate(Date date) {
    this.date = date;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
```

**@Roulette**

Do you have a service method? Feeling neglected by your clients? Add a simple `@Roulette` and sit back while the method throws exceptions at the specified rate.

```
@Roulette(
    probability = 0.005,
    exception = PayYourContractorException,
    message = "Courtesy reminder")
public Service getRockSolidService() {
```

**@InfiniteImprobabilityDriveFactor**

Reserve this annotation for emergencies. Say you've pushed off that impossible task, you have no time left and your team lead is screaming code freeze. Rather than throwing in the towel, put this annotation on your unimplemented interface and pray the Infinite Improbability Drive activates in time to save your hide.

```
@InfiniteImprobabilityDriveFactor(base = 2, power = 43112609)
public interface Salesman {
  List<Road> travelShortestPath(List<City> cities);
}
```


## Literary Annotations ##

These speak for themselves . . . so to speak. Don't let another haiku or oxymoron go by again without slapping on one of these bad boys. You'll forever be revered for your code style and your code _style_.

```
@Alliteration
Peck pickledPeppers = peterPiper.pick();

@Haiku
public void checkNodes() {
  if (tree.hasAnyLeafNodes()) {
    freshenLeavesOn(tree);
  }
}

@HapaxLegomenon
public interface Honorificabilitudinitatibus {
  void achieve(Honour honour);
}

@Metaphor
public interface Life extends Box<Chocolate> {
}

@Meter(TROCHAIC)
public abstract double axisOffset();

@Oxymoron
public interface DisassemblerFactory {
  Disassembler createDisassembler();
}

@Palindrome
Event e = gala.get(n, EVE);

@Synecdoche
Network fiber = NetworkFactory.createNetwork();
```


## Remark Annotations ##

Comments in Javadocs--who reads them? Annotations are so fashion-forward. Nothing catches attention like a good `@OhSnap` or `@FTW`.

Doing a code review? You can mix and match Remark annotations to effect a healthy smack down:

```
@LOL @Facepalm
@WTF("just use Collections.reverse()")
@Booyah
private static <T> void invertOrdering(List<T> list) {
  for (int i = 0; i < list.size() / 2; i++) {
    int j = list.size() - 1 - i;
    T item1 = list.get(i);
    T item2 = list.get(j);
    list.set(i, item2);
    list.set(j, item1);
  }
}
```

You can also use Remark annotations to preemptively qualify your own miserable code:

```
@Hack
@PleaseDontShowUpOn(Website.REDDIT)
public String unescapePseudoEscapedCommasAndSemicolons(String url) {
```

Ever get the urge to leave a quote? Use `@ObligatoryQuote`:

```
@ObligatoryQuote(
    quote = "Remember, raptors run at 10 m/s and they do not know fear."
    source = Source.XKCD,
    citation = "http://xkcd.com/135/")
public Route planRoute(FloorPlan floorPlan, Set<Velociraptor> raptors);
```


At times, you may feel the need to call out your source of inspiration, go ahead and `@ShoutOutTo` them:

```
@ShoutOutTo("The Buzz Out Loud crew")
public void castPod() {
  jason.setLength(INDETERMINATE);
  molly.activateNerdVoice();
  tom.expatiateOratorically();
}
```

Stumble across code that somehow works beyond all reason? Life's short. Mark it with `@Magic` and move on:

```
@Magic
public static int negate(int n) {
  return new Byte((byte) 0xFF).hashCode()
      / (int) (short) '\uFFFF' * ~0
      * Character.digit ('0', 0) * n
      * (Integer.MAX_VALUE * 2 + 1)
      / (Byte.MIN_VALUE >> 7) * (~1 | 1);
}
```

Java is a verbose language. Sometimes you're stuck using it. Sometimes you want to express your frustration. Sure:

```
@ThisWouldBeOneLineIn(
    language = "haskell"
    toWit = "product [1..n]")
public int factorial(int n) {
  int fac = 1;
  for (int i = 1; i <= n; i++) {
    fac *= i;
  }
  return fac;
}
```

# Thanks #

Hey, thanks for taking the time to read through this guide, and we hope you have fun using the Google Annotations Gallery in your own code. Have an annotation you really feel belongs in this gallery? Brilliant. Feel free to contact the mailing list and see about becoming a contributor.