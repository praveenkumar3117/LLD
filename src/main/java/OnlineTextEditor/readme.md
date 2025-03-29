Problem Statement
Design a system for an online text editor where users can type text and apply different formatting styles (like bold, italic, underline) to their text dynamically.
The system should allow applying multiple styles together and should be flexible to add new styles in the future without modifying existing code.






we created a Text abstract class
PlainText will extend it
StylesDecorator also extends it
BoldStyle takes Text object and uses constructor injection
Final Score: 8/10
