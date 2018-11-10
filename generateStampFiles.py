import json

print("Generating stamp files")

stamps = [
  "armor_plate",
  "armor_trim",
  "arrow_head",
  "arrow_shaft",
  "axe_head",
  "binding",
  "boots_core",
  "bow_limb",
  "bow_string",
  "broad_axe_head",
  "chest_core",
  "cross_guard",
  "emerald",
  "excavator_head",
  "fletching",
  "hammer_head",
  "hand_guard",
  "helmet_core",
  "kama_head",
  "knife_blade",
  "large_plate",
  "large_sword_blade",
  "leggings_core",
  "pan_head",
  "pick_head",
  "polishing_kit",
  "scythe_head",
  "shard",
  "sharpening_kit",
  "shovel_head",
  "sign_head",
  "sword_blade",
  "tool_rod",
  "tough_binding",
  "tough_tool_rod",
  "wide_guard"
]

for stamp in stamps:
  with open('src/main/resources/assets/emberstic/models/item/stamp_%s.json' % stamp, 'w') as outfile:
      data = {
        "parent": "item/generated",
        "textures": {
          "layer0": "emberstic:items/stamp_%s" % stamp
        }
      }
      json.dump(data, outfile, indent=2)

print("Done!")