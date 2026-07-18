# wadachi — autonomous mobility actor

`wadachi` (轍) is the standalone Tier-B actor for auditable, ODD-constrained autonomous mobility. Its canonical metadata, schemas, contracts, and datasets are EDN. JSON identity projections are isolated under `wire/`.

## Layout

- `src/wadachi/` — actor methods, cells, Murakumo placement, and Kotoba ingest
- `test/wadachi/` — offline deterministic tests
- `schema/` — cell and Kotoba schemas
- `contracts/lexicon/` — canonical lexicon contracts
- `data/` — canonical EDN seed and identity journal
- `wire/identity/` — externally served DID/profile JSON
- `docs/adr/` — actor-owned decision record

Run the suite with `bb test`.

The actor preserves the SAE Level-4 ceiling, deterministic trajectory, witness, no-server-key, operator-gating, energy-budget, and Murakumo-only inference constraints recorded in `manifest.edn` and the ADR.
