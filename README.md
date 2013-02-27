PrisonPearl
===========

Minecraft plugin for civcraft which allows players to imprison other players inside ender pearls

Commands: 

   pplocate:
      description: Locates your prison pearl
      usage: /<command>
      aliases: ppl
  
   ppfeed:
      description: Feeds prison pearls
      usage: /<command>
      
   pplocateany:
      description: Locates any prison pearl in the world
      usage: /<command> player
      permission: prisonpearl.locateany
   
   ppfree:
      description: Frees a prison pearl
      usage: /<command> [player]
      aliases: ppf
      
   ppfreeany:
      description: Frees any prison pearl in the world
      usage: /<command> player
      permission: prisonpearl.freeany
      
   ppsummon:
      description: Summons a player from their prison pearl, requiring them to stay within range of their pearl
      usage: /ppsummon [player] [range]
      aliases: pps
      
   ppreturn:
      description: Returns a summoned player back to their prison pearl
      usage: /ppbanish [player]
      aliases: ppr
      
   ppkill:
      description: Instantly kills a summoned player, sending them back to their prison pearl
      usage: /ppkill [player]
      aliases: ppk
      
   ppsave:
      description: Saves all prisonpearl related data to disk
      usage: /ppsave
      permission: prisonpearl.save
      
   ppimprisonany:
      description: Imprisons any player in the world
      usage: /ppimprisonany player
      permission: prisonpearl.imprisonany
      
   ppbroadcast:
      description: Broadcast your pplocate commands to another player
      usage: /ppbroadcast player
      alias: ppb
      
   ppconfirm:
      description: Confirm reception of pplocate commands from a player
      usage: /ppconfirm [player]
      
   ppsilence:
      description: Silence reception of pplocate commands from player
      usage: /ppsilence player
     
   ppinfo:
      description: Get information about player in a pearl
      usage: /ppinfo [player]
      alias: ppi
   pploadalts:
      description: reload alt lists from file
      usage: /pploadalts
   ppcheckall:
      description: checkban all accounts
      usage: /ppcheckall
   ppcheck:
      description: checkban the player
      usage: /ppcheck [player]

   ppsetdist:
      description: Sets distance prisoner can move.

   ppsetdamage:
      description: Sets damage prisoner receives.

   pptogglespeech:
      description: Toggles whether prisoner can talk in public chat.

   pptoggledamage:
      description: Toggles whether prisoner can damage players and mobs.

   pptoggleblocks:
      description: Toggles whether prisoner can break blocks.

   ppsetmotd:
      description: Sets prisoner's MOTD.
      
