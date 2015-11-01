
## ToDo

Make a old school turn based medieval RPG game.

* Define a character

        class or associative container with base combat properties, stats and derived bonuses
            
            Base combat properties:
            
                damage = 10
            
                evasion = 10
            
                health = 10
            
            Stats -> Derived bonuses:
            
            strength -> damage bonus
            
            speed -> evasion bonus
            
            hardiness -> health bonus
    
        class methods or functions that define 
            
            how damage is calculated
            
            how evading an attack is determined
            
            Use randomization to make it interesting
            
                For example calculate the evasion attempt or damage done but apply a random % to the result to calculate actual result
        
* Define some items

        add a class field / key for an equipped weapon to your character
        
        add a list for consumables
        
        define a class or associative container for weapons
        
            weapons give a large damage bonus
        
            weapons damage bonus is proportional to their evasion penalty (a negative evasion bonus)
        
        define a class or associative container for consumables
        
            consumables give bonus to either damage, evasion or speed for X number of turns (combat is turn based)

* Define rules
    
        Define how weapons and consumables are acquired
        
        Define how many points character have to spend on stats in character creation
        
        Define what and how much character can do each turn
    
* Create user interaction with the system 
    
        Character creation, ask turn activities etc.
