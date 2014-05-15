      package me.goreacraft.enchant;
      
      import java.util.logging.Logger;

      import org.bukkit.command.Command;
      import org.bukkit.command.CommandSender;
      import org.bukkit.enchantments.Enchantment;
      import org.bukkit.entity.Player;
      import org.bukkit.inventory.ItemStack;
      import org.bukkit.plugin.java.JavaPlugin;
      
      
      public class Enchant
        extends JavaPlugin
      {
        public static Enchant plugin;
      public final Logger logger = Logger.getLogger("Minecraft");
        
        public void onDisable()
        {
        this.logger.info("Gorea Enchant is now disabled.");
        }
        
        public void onEnable()
        {
        this.logger.info("Gorea Enchant is now enabled.");
        }
        
        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
        {
        Player p = (Player)sender;
          
        ItemStack item = p.getInventory().getItemInHand();
        if ((commandLabel.equalsIgnoreCase("goreaenchant")) && ((p.isOp()) || (p.hasPermission("gorea.enchant"))))
         {
          if ((args.length == 1) && (args[0].equals("list")))
            {
            p.sendMessage("sharpness, knockback, protection, fireaspect, unbreaking, fortune, looting, power, flame, thorns,aquaaffinity, efficiency, baneofarthropods, smite, respiration, featherfalling, fireprotection, projectileprotection");
            }
          else if (args.length == 2)
            {
            int level = Integer.parseInt(args[1]);
            if (args[0].equalsIgnoreCase("sharpness")) {
              item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, level);
              }
            if (args[0].equalsIgnoreCase("knockback")) {
              item.addUnsafeEnchantment(Enchantment.KNOCKBACK, level);
             }
            if (args[0].equalsIgnoreCase("protection")) {
              item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, level);
              }
            if (args[0].equalsIgnoreCase("fireaspect")) {
              item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, level);
             }
            if (args[0].equalsIgnoreCase("unbreaking")) {
              item.addUnsafeEnchantment(Enchantment.DURABILITY, level);
              }
            if (args[0].equalsIgnoreCase("fortune")) {
              item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, level);
              }
            if (args[0].equalsIgnoreCase("looting")) {
              item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, level);
              }
            if (args[0].equalsIgnoreCase("power")) {
              item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, level);
              }
            if (args[0].equalsIgnoreCase("flame")) {
              item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, level);
              }
            if (args[0].equalsIgnoreCase("thorns")) {
              item.addUnsafeEnchantment(Enchantment.THORNS, level);
              }
            if (args[0].equalsIgnoreCase("aquaaffinity")) {
              item.addUnsafeEnchantment(Enchantment.WATER_WORKER, level);
              }
            if (args[0].equalsIgnoreCase("efficiency")) {
              item.addUnsafeEnchantment(Enchantment.DIG_SPEED, level);
              }
            if (args[0].equalsIgnoreCase("baneofarthropods")) {
              item.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, level);
              }
            if (args[0].equalsIgnoreCase("smite")) {
              item.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, level);
              }
            if (args[0].equalsIgnoreCase("respiration")) {
              item.addUnsafeEnchantment(Enchantment.OXYGEN, level);
              }
            if (args[0].equalsIgnoreCase("featherfalling")) {
              item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, level);
              }
            if (args[0].equalsIgnoreCase("fireprotection")) {
              item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, level);
              }
            if (args[0].equalsIgnoreCase("projectileprotection")) {
              item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, level);
              }
            }
            else
       {
         p.sendMessage("Use /goreaenchant <enchant> <level>, see '/goreaenchant list' for enchants");
       }
       return true;
     }
    p.sendMessage("Error, you do not have permission to do that.");
    
    return false;
   }
 }

