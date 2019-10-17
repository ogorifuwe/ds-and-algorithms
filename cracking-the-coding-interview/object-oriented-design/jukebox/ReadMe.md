Jukebox: Design a musical jukebox using object-oriented prin-
ciples.

Hint:

    *   Scope the problem first and make a list of your
        assumptions. It's often okay to make reasonable
        assumptions, but you need to make them explicit.

SOLUTION

    In any object-oriented design question, you first want to
    start off with asking your interviwer some questions to
    clarify design constraints.
    --Is this jukebox playing CDs? Records? MP3s?
    --Is it a simulation on a computer, or is it
    supposed to represent a physical jukebox?
    --Does it take money, or is it free? And if it takes money,
    which currency? And does it deliver change?
    
    This solution, assumes the jukebox is a computer simulation
    that closely mirrors physical jukeboxes, and that it's free.  

    * Jukebox
    * CD
    * Song
    * Artist
    * Playlist
    * Display (displays details on the screen)

    * Playlist creation (includes add, delete, and shuffle)
    * CD selector
    * Song selector
    * Queuing up a song
    * Get next song from playlist

    A user also can be introduced:
    * Adding
    * Deleting
    * Credit information
