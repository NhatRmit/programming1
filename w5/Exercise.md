Basic OOP 1

Exercise 1

    You are hired by a 5* restaurant as their software architect (i.e., you design the whole software system, not just implement code). The first task you need to do is to create a collection of classes/objects to manage their food management and producing processes.

    All food contains different amounts of ingredients. So, creating an ingredient class is needed.

    Note: even for experienced software designers (not graphics designers) and business analysts, it's almost impossible to know in advance all details of the systems they are developing. So, keep in mind that your designed classes/objects will be changed in the future. As an architect, try to design your system so that future changes do not require you to change much current implementations.

    Create an Ingredient class. You need to store the name (String) and measurement unit (String) of each ingredient.

    Some example instances of Ingredient:

    · name: water, measurement unit: spoon

    · name: water, measurement unit: teaspoon

    · name: sugar, measurement unit: mg

    · name: chicken, measurement unit: kg

    You need to decide the class' required methods/fields to support the above needs.

Exercise 2

    Develop a program that create and display Ingredient instances. To create an ingredient instance, ask the user for the name and measurement unit. You can use an array to store all the ingredients. In this program, create a method to display all created ingredients.

Exercise 3

    To prevent users from entering something like 'asdfgh' for measurement unit, you need to protect the measurement unit field. As a result, update your code so that the measurement unit field cannot be accessed directly from outside the Ingredient class. If users want to access that field, they must call the setter and getter methods instead. Then, you can place required protection code inside those methods.

Exercise 4

    Implement a Recipe class to manage food recipe for the restaurant. A recipe has a name (String) and an array of components. Each component is an instance of RecipeComponent class. Each RecipeComponent instance, in turn, contains an Ingredient instance and a floating number amount.

    For example, this Recipe instance represents a scone recipe (don't ask me how I know it, I got it from Google)

    scone (Recipe)

    {

        [c1, c2, c3]

    }

    ---

    c1 (RecipeComponent)

    {

        ingredient: {name: "self-rising flour", measurement unit: "g"}

        amount: 500

    }

    ---

    c2 (RecipeComponent)

    {

        ingredient: {name: "chilled lemonade", measurement unit: "cup"}

        amount: 1

    }

    ---

    c3 (RecipeComponent)

    {

        ingredient: {name: "thickened cream", measurement unit: "ml"}

        amount: 300

    }

    Your program needs to allow users to create new recipes and display them. To verify your program, create the recipe I provided in the example. 

