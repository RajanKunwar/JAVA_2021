                             #Java CardLayout

.The Java CardLayout class manages the components in such a manner that only one component is visible at a time.

.It treats each component as a card that is why it is known as CardLayout.



*Constructors of CardLayout Class

.CardLayout(): creates a card layout with zero horizontal and vertical gap.

.CardLayout(int hgap, int vgap): creates a card layout with the given horizontal and vertical gap.



*Commonly Used Methods of CardLayout Class

.public void next(Container parent): is used to flip to the next card of the given container.

.public void previous(Container parent): is used to flip to the previous card of the given container.

.public void first(Container parent): is used to flip to the first card of the given container.

.public void last(Container parent): is used to flip to the last card of the given container.

.public void show(Container parent, String name): is used to flip to the specified card with the given name.




                                  #GridBagLayout

The Java GridBagLayout class is used to align components vertically, horizontally or along their baseline.


*Constructor

.GridBagLayout(): The parameterless constructor is used to create a grid bag layout manager.
