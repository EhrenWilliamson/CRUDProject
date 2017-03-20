# Sushi Project

This sushi project uses Spring with Gradle to display an ArrayList that allows you to add sushi. The properties are ID, Fish, Rice, and Wrapper.The JSTL in the JSPs use a for each loop to show the whole ArrayList with add, remove, and edit features. This is implemented using a command object and a DAO on the backend. The page is styled using bootstrap with a simple navigation bar.

## Next version if time permits
I would have added form validation with additional time as well as a shopping cart feature that would allow you to buy the sushi you added to the ArrayList.

## Lessons Learned

Form validation has to go further than basic HTML/CSS validation as unexpected behavior can occur. The delete and edit functions were more complex than originally thought. The javadoc for ArrayList was examined and using a .equals override in the  bean allowed for the removal from the ArrayList. The edit feature also used the .equals to edit the object in the ArrayList.
