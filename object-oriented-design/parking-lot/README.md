Parking Lot: Design a parking lot using object-oriented principles.

Hint:

    *   Does the parking lot have multiple levels? What "features"
        does it support? Is it paid? What type of vehicles?

SOLUTION

    The wording of this question is vague,  just as it would be in an
    actual interview. This requires you to have a conversation with
    your interviewer about what types of vehicles it can support,
    whether the parking lot has multiple levels, and so an.

    This solution we'll make the following assumptions. We made these
    specific assumptions to add a bit of complexity to the problem
    without adding too much. If you made different assumptions, that's
    totally fine.

    *   The parking lot has multiple levels. Each level has multiple
        rows of spots.

    *   The parking lot can park motorcycles, cars, and buses.

    *   The parking lot has motorcycle spots, compact spots, and
        large spots.

    *   A motorcycle can park in any spot.

    *   A car can park in either a single compact spot or a single
        large spot.

    *   A bus can park in five large spots that are consecutive and
        within the same row. It cannot park in small spots.

    In this implementation, we create an abstract class Vehicle, from
    which Car, Bus, and Motorcycle inherit. To handle the different
    parking spot sizes, we have just one class ParkingSpot which has a
    member variable indicating the size.
