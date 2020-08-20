### Introduction
When building software we breaking down concepts into small composable units, which are easy to change. Just like [Jerryrigeverything](https://www.youtube.com/results?search_query=jerryrigeverything) everything says-- "Glass is glass and glass breaks"
So, software is soft and soft means easy to change.

Breaking down concepts/problems into small composable units is factoring and changing these units is refactoring.

### What is refactoring (Textbook)?
Changing internal structure to code without affecting its external behavior. This is normally done to improve performance or improving the internal structure. (Normally to reduce complexity and increase readability).

### When I first heard of refactoring?
I first heard of refactoring in the context of TDD. First, you write a failing test, write code to make the test pass. This is where most of us stop, but the extra step pros take is refactor, make the code fit better in the system.

### When to refactor?
**Code smells**
Some times referred to as yuck code. This is when you working on some code but the surrounding code looks very dirty or doesn’t look right ie Yucky. This requires some sort of "code sense” but no worries, people have tried to document all these heuristics. A list of existing heuristics for spotting Yucky code from Uncle bob’s Clean code and Martin  Fowler’s refactoring). [Link](https://refactoring.guru/refactoring/smells)

**Not understanding (Finding Waldo)**
When you working a piece of code but and very hard to figure out the surrounding logic. You figure it out, but at that moment that understanding is just in your head. This understanding needs to be reflected in the code, so you make it easier by reduce complexity and increase readability and remember code is meant a communication tool between humans not just for the machine to execute.

**Preparatory refactoring**
When you have a new feature that you have to add to the system. But the current shape of the system or units does not match the current understanding/domain. So you have to refactor the code to match your current understanding. Then you add the new feature.
Like a Random quote I got from the internet — First, Make the change easy, then make the easy change)

**Planned refactoring.**
Overtime code will be changed, and the integrity of the structure and design will slowly fade, and the code slowly changes from engineering into hacking.
This is a tell-tell sign that. You’re doing something wrong but this what normally happens in normal systems. Refactoring is supposed to be a slow but magical process that leads you to the promised land

**Long term refactoring.**
When you have the desired state you want the entire code base to be at but slowly make refactors to reach that goal. Then we will have well-fitted components that are easy to change.
This is something that some people do before the start of the project in the planning phase but it’s extremely hard to achieve.
A common technique used is called branch my abstraction [Link](https://martinfowler.com/bliki/BranchByAbstraction.html)  
**Why**
- Economic (Not modular, cleaner) Like Kevlin Henney once titled his talk cars have brakes so that we can go faster.
- Design stamina Hypothesis (Very fancy big word to leave you with). (Design pay off) The better the design the easier it is to add new features.
- [Echo Martin Fowler’s words] I call this a hypothesis because it is an opinion, there is no objective proof that this phenomenon occurs. In scientific terms, it's not a very good hypothesis because it's hard to test. We CannotMeasureProductivity nor can we measure design quality.
