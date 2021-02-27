# Amazon Assessment
# Optimizing Alexa Suggestions 

Amazon's Alexa team is working on optimizing the customer experience for scenarios where customers ask generic question. One example of a generic question is "what are good vegetarian restaurant nearby?" In this example, Alexa would then search for all vegetarian restaurant in the city and select the nearest x vegetarian restaurant relation in the city, implement an algorithm to find the nearest x vegetarian restaurant to the customer's location.


# Input
The input to the function/method consists of two arguments:
allLocation, a list of elements where each element consists os a pair of integer representing the x and y coordinates of the vegetarian restaurants in the city;
numberOfRestaurant, an integer representing the number of nearby vegetarian restaurants that would be returned to the customer (x).

# Output
Return a list of elements where each elements of the list represents the x and y integer coordinates of the nearest recommended vegetarian restaurant relative to customer's location. If there is a tie, return any of the locations as long as you satisfy returnig exactly X nearby vegetarian restaurants. If no locations is possible, return a list with an empty location - not just an empty list.

# Constraints 
numberOfRestaurant <= size(allLocation)

# Note
The customer begins at the location [0,0].
The distance from the customer's current location to a recommended vegetraian restaurant location (x,y) is the square root of x2 + y2.
If there are ties then return any of the locations as long as you satisfy returnig exactly X nearby vegetarian restaurants.
The returned output can be in any order.

# Example 
Input:
allLocation = [[1,2],[3,4],[1,-1]]
numberOfRestaurant = 2

Output:
[[1,-1],[1,2]]

Explanation:

The distance of the customer's current location from location [1,2] is square root(5) = 2.236

The distance of the customer's current location from location [3,4] is square root(25) = 5

The distance of the customer's current location from location [1,-1] is square root(2) = 1.414

The required number of vegetarian restaurant is 2, hence the output is [1,-1] and [1,2].
